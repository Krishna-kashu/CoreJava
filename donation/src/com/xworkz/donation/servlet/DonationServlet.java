package com.xworkz.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation", loadOnStartup = 1)
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname =  servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String mail = servletRequest.getParameter("mail");
        String donate = servletRequest.getParameter("donation");

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        // abstraction : Servlet Chaining
        RequestDispatcher requestDispatcher=
                servletRequest.getRequestDispatcher("DonationSuccess.jsp");
        // jsp--> generate servlet--> service(servletRequest,servletResponse)==>write HTML;
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
