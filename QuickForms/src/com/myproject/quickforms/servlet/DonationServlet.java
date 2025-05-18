package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationServlet extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method called bt Tomcat");

        String name = servletRequest.getParameter("donorName");
        String number = servletRequest.getParameter("donationAmount");
        String email = servletRequest.getParameter("donorEmail");
        String message = servletRequest.getParameter("donationMessage");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("donationSuccess.jsp");

        requestDispatcher.forward(servletRequest,servletResponse);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

    }
}