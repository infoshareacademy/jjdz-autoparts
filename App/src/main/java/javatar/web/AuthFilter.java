package javatar.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter({"/Brands",
        "/Cart",
        "/Models",
        "/Engines",
        "/PartFirstCategory",
        "/PartCategory",
        "/AllegroLink",
        "/AddingToCart",
        "/Output.jsp",
        "/logout",
        "/usersList",
        "/AdministrationConsole.jsp",
        "/setAdminUser",
        "/revokeAdmin",
        "/setReportsUser",
        "/revokeReports"})
public class AuthFilter implements Filter {


    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    SessionData sessionData;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!sessionData.isLoggedIn()) {

            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.sendRedirect("/jjdz-autoparts");
            LOGGER.debug("User is empty. Redirecting to main page");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
