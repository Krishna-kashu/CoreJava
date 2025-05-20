package com.myproject.quickforms.servlet;

import com.myproject.quickforms.dto.DonationDTO;

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

        String name = req.getParameter("name");
        String number = req.getParameter("contact");
        String amount = req.getParameter("amount");
        String email = req.getParameter("email");
        String message = req.getParameter("description");

        DonationDTO donationDTO = new DonationDTO();
        donationDTO.setName(name);
        donationDTO.setContact(number);
        donationDTO.setAmount(amount);
        donationDTO.setEmail(email);
        donationDTO.setDescription(message);

        req.setAttribute("donation", donationDTO);
        req.setAttribute("message", "Donation received successfully!");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("donationSuccess.jsp");
        requestDispatcher.forward(req, resp);
    }
}
