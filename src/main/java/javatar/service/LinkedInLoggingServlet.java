package javatar.service;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuth20Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(urlPatterns = "/LinkedInLogging")
public class LinkedInLoggingServlet extends HttpServlet {


    private final static String CLIENT_ID = "77xs0912y99z8t";
    private final static String CLIENT_CONFIDENTIAL_ID = "XpW20vY3AXkmqoOI";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OAuth20Service service = new ServiceBuilder()
                .apiKey(CLIENT_ID)
                .apiSecret(CLIENT_CONFIDENTIAL_ID)
                .callback("http://localhost:8080/jjdz-autoparts/LinkedInRedirect")
                .build(LinkedInApi20.instance());

       resp.sendRedirect(service.getAuthorizationUrl());

    }

//    public static void main(String[] args) {
//        final Scanner in = new Scanner(System.in);
//        System.out.println(service.getAuthorizationUrl());
//        final String code = in.nextLine();
//        final OAuth2AccessToken accessToken = service.getAccessToken(code);
//        final OAuthRequest requestName = new OAuthRequest(Verb.GET, String.format(PROTECTED_RESOURCE_URL, "lastName"),
//                service);
//        requestName.addHeader("x-li-format", "json");
//        requestName.addHeader("Accept-Language", "en-EN");
//        service.signRequest(accessToken, requestName);
//        final Response response = requestName.send();
//
//        System.out.println(response.getCode());
//        System.out.println(response.getBody());
//
//
//
//
//    }

}
