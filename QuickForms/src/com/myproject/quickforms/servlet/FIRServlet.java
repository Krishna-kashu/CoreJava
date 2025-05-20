package com.myproject.quickforms.servlet;

import com.myproject.quickforms.dto.firDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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

        firDTO dto = new firDTO();
        dto.setName(name);
        dto.setContact(number);
        dto.setDatetime(datetime);
        dto.setLocation(location);
        dto.setDescription(description);

        req.setAttribute("message", "Save Success");
        req.setAttribute("firData", dto);

        System.out.println("Forwarding request to firSuccess.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("firSuccess.jsp");
        dispatcher.forward(req, resp);
        System.out.println("Request forwarded successfully");
    }
}
