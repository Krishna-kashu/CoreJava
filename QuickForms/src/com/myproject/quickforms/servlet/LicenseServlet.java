package com.myproject.quickforms.servlet;

import com.myproject.quickforms.dto.LicenseDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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

        LicenseDTO dto = new LicenseDTO();
        dto.setName(name);
        dto.setLicense(license);
        dto.setIdProof(idProof);
        dto.setReason(reason);

        req.setAttribute("message", "Request submitted successfully!");
        req.setAttribute("licenseData", dto);

        System.out.println("Forwarding request to licenseSuccess.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("licenseSuccess.jsp");
        dispatcher.forward(req, resp);
        System.out.println("Request forwarded successfully");
    }
}
