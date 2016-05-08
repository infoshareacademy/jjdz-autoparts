package javatar.service;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.gson.Gson;
import javatar.model.CarFromAztec;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/LinkedInRedirect")
public class LinkedInRedirectServlet extends HttpServlet {

    private final static String CLIENT_ID = "77xs0912y99z8t";
    private final static String CLIENT_CONFIDENTIAL_ID = "XpW20vY3AXkmqoOI";
    private static final String PROTECTED_RESOURCE_URL = "https://api.linkedin.com/v1/people/~:(first-name,last-name,email-address)";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OAuth20Service service = new ServiceBuilder()
                .apiKey(CLIENT_ID)
                .apiSecret(CLIENT_CONFIDENTIAL_ID)
                .scope("r_basicprofile,r_emailaddress")
                .callback("http://localhost:8080/jjdz-autoparts/LinkedInRedirect")
                .build(LinkedInApi20.instance());
        final String code = req.getParameter("code");

        final OAuth2AccessToken accessToken = service.getAccessToken(code);
        final OAuthRequest requestName = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL,
                service);

        requestName.addHeader("x-li-format", "json");
        requestName.addHeader("Accept-Language", "en-EN");

        service.signRequest(accessToken, requestName);

        final Response response = requestName.send();

        String linkedinJson = response.getBody();
        Gson gson = new Gson();
        LinkedInUser linkedInUser = gson.fromJson(linkedinJson, LinkedInUser.class);

        GlobalUser user = new GlobalUser(linkedInUser);

        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        resp.sendRedirect("http://localhost:8080/jjdz-autoparts/");


    }
}
