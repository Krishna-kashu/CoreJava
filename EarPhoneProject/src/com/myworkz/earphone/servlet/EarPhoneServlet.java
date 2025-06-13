package com.myworkz.earphone.servlet;

import com.myworkz.earphone.dto.EarPhoneDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ear", loadOnStartup = 1)
public class EarPhoneServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost bt tomcat");

        String brand = req.getParameter("brand");
        String type = req.getParameter("type");
        Double cost =
        String feature = req.getParameter("features");
        String color = req.getParameter("color");
        String warranty = req.getParameter("warranty");

        EarPhoneDTO earPhoneDTO = new EarPhoneDTO();
        earPhoneDTO.setBrand(brand);
        earPhoneDTO.setType(type);
        earPhoneDTO.


    }
}
