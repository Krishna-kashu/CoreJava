package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 2)
public class FeedBackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() method called by Tomcat");

        String name = req.getParameter("name");
        String number = req.getParameter("contact");
        String email = req.getParameter("email");
        String feedback = req.getParameter("feedback");

        req.setAttribute("name", name);
        req.setAttribute("contact", number);
        req.setAttribute("email", email);
        req.setAttribute("feedback", feedback);
        req.setAttribute("message", "Feedback submitted successfully!");

        System.out.println("Forwarding request to feedbackSuccess.jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("feedbackSuccess.jsp");

        requestDispatcher.forward(req, resp);


    }
}