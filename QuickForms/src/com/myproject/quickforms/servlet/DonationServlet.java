package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method called bt Tomcat");

        String name = servletRequest.getParameter("donorName");
        String number = servletRequest.getParameter("donationAmount");
        String email = servletRequest.getParameter("donorEmail");
        String message = servletRequest.getParameter("donationMessage");

//        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
//        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("laboratorySuccess");
//        requestDispatcher.forward(servletRequest,servletResponse);
//        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        // abstraction : Servlet Chaining
        RequestDispatcher requestDispatcher=
                servletRequest.getRequestDispatcher("donationSuccess.jsp");
        // jsp--> generate servlet--> service(servletRequest,servletResponse)==>write HTML;
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}