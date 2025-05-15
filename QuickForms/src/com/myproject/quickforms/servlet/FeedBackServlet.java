package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 2)
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method called bt Tomcat");

        String name = servletRequest.getParameter("name");
        String number = servletRequest.getParameter("contact");
        String email = servletRequest.getParameter("email");
        String feedback = servletRequest.getParameter("feedback");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("feedbackSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

    }
}