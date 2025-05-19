package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab", loadOnStartup = 4)
public class LabServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() method called by Tomcat");

        String name = req.getParameter("name");
        String number = req.getParameter("RollNumber");
        String RNumber = req.getParameter("RNumber");
        String observation = req.getParameter("observation");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("laboratorySuccess.jsp");

        req.setAttribute("name", name);
        req.setAttribute("RollNumber", number);
        req.setAttribute("RNumber", RNumber);
        req.setAttribute("observation", observation);
        req.setAttribute("message", "Observation recorded successfully!");

        requestDispatcher.forward(req, resp);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
    }
    }
