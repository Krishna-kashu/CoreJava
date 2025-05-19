package com.myproject.quickforms.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/license", loadOnStartup = 5)
public class LicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() method called by Tomcat");

        String name = req.getParameter("name");
        String license = req.getParameter("license");
        String idProof = req.getParameter("idProof");
        String reason = req.getParameter("reason");

        System.out.println("Using request dispatcher to forward the request and response to another servlet/jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("licenseSuccess.jsp");

        req.setAttribute("name", name);
        req.setAttribute("license", license);
        req.setAttribute("idProof", idProof);
        req.setAttribute("reason", reason);
        req.setAttribute("message", "Request submitted successfully!");

        requestDispatcher.forward(req,resp);
        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

    }
}