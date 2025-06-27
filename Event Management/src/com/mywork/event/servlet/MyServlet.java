package com.mywork.event.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/save")
public class MyServlet extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init method in servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String studentName = servletRequest.getParameter("studentName");
        String degree= servletRequest.getParameter("degreeAwarded");

        System.out.println("Student name: "+studentName);
        System.out.println("Degree: "+degree);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("From servlet");

    }

}
