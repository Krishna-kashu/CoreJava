package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fir", loadOnStartup = 3)
public class FIRServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method called bt Tomcat");

        String name = servletRequest.getParameter("name");
        String number = servletRequest.getParameter("contact");
        String datetime = servletRequest.getParameter("datetime");
        String location = servletRequest.getParameter("location");
        String description = servletRequest.getParameter("description");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
    }
    }
