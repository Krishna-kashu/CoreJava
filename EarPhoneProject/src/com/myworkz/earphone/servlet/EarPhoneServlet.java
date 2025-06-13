package com.myworkz.earphone.servlet;

import com.myworkz.earphone.dto.EarPhoneDTO;
import com.myworkz.earphone.repository.EarPhoneRepo;
import com.myworkz.earphone.repository.EarPhoneRepoImpl;
import com.myworkz.earphone.service.EarPhoneService;
import com.myworkz.earphone.service.EarPhoneServiceImpl;

import javax.servlet.RequestDispatcher;
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
        String cost = req.getParameter("cost");
        String feature = req.getParameter("features");
        String color = req.getParameter("color");
        String warranty = req.getParameter("warranty");

        EarPhoneDTO earPhoneDTO = new EarPhoneDTO();
        earPhoneDTO.setBrand(brand);
        earPhoneDTO.setType(type);
        earPhoneDTO.setCost(Double.parseDouble(cost));
        earPhoneDTO.setColor(color);
        earPhoneDTO.setFeatures(feature);
        earPhoneDTO.setWarranty(warranty);

        EarPhoneService earPhoneService = new EarPhoneServiceImpl();
        boolean saved = earPhoneService.save(earPhoneDTO);


        if(saved){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
            req.setAttribute("message", "Details Saved Successfully");
            req.setAttribute("details", earPhoneDTO);
            requestDispatcher.forward(req,resp);

            EarPhoneRepo earPhoneRepo = new EarPhoneRepoImpl();
            earPhoneRepo.persist(earPhoneDTO);
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("form.jsp");
            req.setAttribute("message", "Something Went Wrong try again");
            requestDispatcher.forward(req,resp);
        }

    }
}
