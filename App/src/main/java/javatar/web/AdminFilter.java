package javatar.web;

import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter({"/usersList",
        "/AdministrationConsole.jsp",
        "/setAdminUser",
        "/revokeAdmin",
        "/setReportsUser",
        "/revokeReports"})
public class AdminFilter implements Filter {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AdminFilter.class);
    @Inject
    SessionData sessionData;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!sessionData.isAdmin()) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.sendRedirect("/jjdz-autoparts");
            LOGGER.debug("User is not an admin. Redirecting to main page");
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
