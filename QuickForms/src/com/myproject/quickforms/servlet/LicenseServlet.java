package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/license", loadOnStartup = 5)
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method called bt Tomcat");

        String name = servletRequest.getParameter("name");
        String license = servletRequest.getParameter("license");
        String idProof = servletRequest.getParameter("idProof");
        String reason = servletRequest.getParameter("reason");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("licenseSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

    }
}