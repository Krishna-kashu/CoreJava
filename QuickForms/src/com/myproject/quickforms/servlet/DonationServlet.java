package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() method called by Tomcat");

    String name = req.getParameter("donorName");
        String number = req.getParameter("donationAmount");
        String email = req.getParameter("donorEmail");
        String message = req.getParameter("donationMessage");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("donationSuccess.jsp");

        req.setAttribute("donorName", name);
        req.setAttribute("donationAmount", number);
        req.setAttribute("donorEmail", email);
        req.setAttribute("donationMessage", message);
        req.setAttribute("message", "Donation received successfully!");

        requestDispatcher.forward(req,resp);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

    }
}