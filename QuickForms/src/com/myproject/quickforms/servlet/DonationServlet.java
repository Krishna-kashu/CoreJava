package com.myproject.quickforms.servlet;

import com.myproject.quickforms.dto.DonationDTO;
import com.myproject.quickforms.service.DonationService;
import com.myproject.quickforms.service.DonationServiceImpl;

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

        DonationService donationService=new DonationServiceImpl();

        boolean saved= donationService.save(donationDTO);

        if(saved) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("donationSuccess.jsp");

            req.setAttribute("message", "Donation received successfully!");
            req.setAttribute("donation", donationDTO);
            dispatcher.forward(req,resp);
        } else
        {
            RequestDispatcher dispatcher = req.getRequestDispatcher("donation.jsp");
            req.setAttribute("message", "Donation failed!");
            dispatcher.forward(req,resp);
        }
    }
}
