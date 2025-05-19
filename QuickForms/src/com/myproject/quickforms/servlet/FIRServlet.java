package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/fir", loadOnStartup = 3)
public class FIRServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() method called by Tomcat");

        String name = req.getParameter("name");
        String number = req.getParameter("contact");
        String datetime = req.getParameter("datetime");
        String location = req.getParameter("location");
        String description = req.getParameter("description");

        req.setAttribute("message", "Save Success");
        req.setAttribute("name", name);
        req.setAttribute("contact", number);
        req.setAttribute("datetime", datetime);
        req.setAttribute("location", location);
        req.setAttribute("description", description);

        System.out.println("Forwarding request to firSuccess.jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("using request dispatcher to forward the req and resp to another jsp/servlet");
    }
    }
