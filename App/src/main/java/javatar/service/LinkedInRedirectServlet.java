package javatar.service;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.gson.Gson;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import javatar.web.GlobalUserService;
import javatar.web.SessionData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LinkedInRedirect")
public class LinkedInRedirectServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    private final static String CLIENT_ID = "77xs0912y99z8t";
    private final static String CLIENT_CONFIDENTIAL_ID = "XpW20vY3AXkmqoOI";
    private static final String PROTECTED_RESOURCE_URL = "https://api.linkedin.com/v1/people/~:(first-name,last-name,email-address)";


    @Inject
    SessionData sessionData;

    @EJB
    GlobalUserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String error = req.getParameter("error");
        String errorDescription = req.getParameter("error_description");
        LOGGER.debug("LinkedIN error code: ", error);
        LOGGER.debug("LinkedIN error description: ", errorDescription);

        if (null != error) {
            resp.sendRedirect("http://localhost:8080/jjdz-autoparts/");
            return;
        }

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

        LOGGER.debug("LinkedIn JSon file: {}", linkedinJson);

        Gson gson = new Gson();
        LinkedInUser linkedInUser = gson.fromJson(linkedinJson, LinkedInUser.class);

        LOGGER.debug("Creating LinkedIn user. Email: {}, Name: {}, Surname: {}", linkedInUser.getEmailAddress(), linkedInUser.getFirstName(), linkedInUser.getLastName());

        GlobalUser user = userService.getGLobalUser(linkedInUser);

        LOGGER.debug("Global user mail: {} id: {} ", user.geteMail(), user.getId());

        sessionData.logIn(user.getFirstName() + " " + user.getLastName(), user.getId());

        resp.sendRedirect("http://localhost:8080/jjdz-autoparts/");

        LOGGER.debug("Redirect to main page");


    }
}
