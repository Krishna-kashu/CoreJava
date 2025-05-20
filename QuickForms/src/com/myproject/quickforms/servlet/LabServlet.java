package com.myproject.quickforms.servlet;

import com.myproject.quickforms.dto.LabDTO;

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
        String rollNumber = req.getParameter("RollNumber");
        String expNumber = req.getParameter("ExpNumber");
        String observation = req.getParameter("observation");

        LabDTO labData = new LabDTO();
        labData.setName(name);
        labData.setRollNumber(rollNumber);
        labData.setExpNumber(expNumber);
        labData.setObservation(observation);


        req.setAttribute("labData", labData);
        req.setAttribute("message", "Observation recorded successfully!");


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("laboratorySuccess.jsp");
        requestDispatcher.forward(req, resp);
    }
}

