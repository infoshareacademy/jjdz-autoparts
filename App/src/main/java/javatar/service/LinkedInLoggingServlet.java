package javatar.service;

import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LinkedInLogging")
public class LinkedInLoggingServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(LinkedInLoggingServlet.class);
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

        LOGGER.debug("Logging user");
    }


}
