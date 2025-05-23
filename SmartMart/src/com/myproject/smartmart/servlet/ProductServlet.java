package com.myproject.smartmart.servlet;

import com.myproject.smartmart.dto.ProductDTO;
import com.myproject.smartmart.service.ProductService;
import com.myproject.smartmart.service.ProductServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/product", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doPost() method called for /addProduct");

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String weight = req.getParameter("weight");
        String incomingPrice = req.getParameter("incomingPrice");
        String sellingPrice = req.getParameter("sellingPrice");
        String mrp = req.getParameter("mrp");
        String description = req.getParameter("description");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String color = req.getParameter("color");
        String manufDate = req.getParameter("manufDate");
        String warranty = req.getParameter("warranty");
        String email = req.getParameter("email");
        String returnPolicy = req.getParameter("returnPolicy");
        boolean isReturnable = (returnPolicy != null && returnPolicy.equals("on"));

        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(name);
        productDTO.setType(type);
        productDTO.setWeight(weight);
        productDTO.setIncomingPrice(incomingPrice);
        productDTO.setSellingPrice(sellingPrice);
        productDTO.setMrp(mrp);
        productDTO.setEmail(email);
        productDTO.setDescription(description);
        productDTO.setBrand(brand);
        productDTO.setQuantity(quantity);
        productDTO.setColor(color);
        productDTO.setManufDate(manufDate);
        productDTO.setWarranty(warranty);
        productDTO.setReturnable(isReturnable);

        ProductService productService = new ProductServiceImpl();
        boolean saved = productService.save(productDTO);

        if (saved) {
            req.setAttribute("message", "Product added successfully!");
            req.setAttribute("product", productDTO);
            RequestDispatcher dispatcher = req.getRequestDispatcher("productSuccess.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("message", "Failed to add product. Try again.");
            RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
