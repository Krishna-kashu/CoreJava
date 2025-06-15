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
        System.out.println("Running doPost by Tomcat");

        String brand = req.getParameter("brand");
        String type = req.getParameter("type");
        String cost = req.getParameter("cost");
        String features = req.getParameter("features");
        String color = req.getParameter("color");
        String warranty = req.getParameter("warranty");

        boolean hasErrors = false;
        StringBuilder errors = new StringBuilder();

        if (brand == null || brand.trim().isEmpty()) {
            hasErrors = true;
            errors.append("Brand is required.<br>");
        }
        if (type == null || type.trim().isEmpty()) {
            hasErrors = true;
            errors.append("Type is required.<br>");
        }
        double costValue = 0;
        try {
            costValue = Double.parseDouble(cost);
            if (costValue <= 0) {
                hasErrors = true;
                errors.append("Cost must be positive.<br>");
            }
        } catch (NumberFormatException e) {
            hasErrors = true;
            errors.append("Invalid cost format.<br>");
        }
        if (features == null || features.trim().length() < 10) {
            hasErrors = true;
            errors.append("Features must be at least 10 characters.<br>");
        }
        if (color == null || color.trim().isEmpty()) {
            hasErrors = true;
            errors.append("Color is required.<br>");
        }
        if (warranty == null || warranty.trim().isEmpty()) {
            hasErrors = true;
            errors.append("Warranty must be selected.<br>");
        }

        EarPhoneDTO earPhoneDTO = new EarPhoneDTO();
        earPhoneDTO.setBrand(brand);
        earPhoneDTO.setType(type);
        earPhoneDTO.setCost(costValue);
        earPhoneDTO.setColor(color);
        earPhoneDTO.setFeatures(features);
        earPhoneDTO.setWarranty(warranty);

        if (hasErrors) {
            req.setAttribute("message", errors.toString());
            req.setAttribute("dto", earPhoneDTO);
            req.getRequestDispatcher("form.jsp").forward(req, resp);
            return;
        }

        EarPhoneService service = new EarPhoneServiceImpl();
        boolean saved = service.save(earPhoneDTO);

        if (saved) {
            req.setAttribute("message", "Details Saved Successfully");
            req.setAttribute("details", earPhoneDTO);
            req.getRequestDispatcher("success.jsp").forward(req, resp);

            EarPhoneRepo repo = new EarPhoneRepoImpl();
            repo.persist(earPhoneDTO);
        } else {
            req.setAttribute("message", "Something Went Wrong. Try again.");
            req.setAttribute("dto", earPhoneDTO);
            req.getRequestDispatcher("form.jsp").forward(req, resp);
        }
    }
}