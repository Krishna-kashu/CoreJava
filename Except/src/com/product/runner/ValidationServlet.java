package com.product.runner;

import com.product.dto.ProductDTO;
import com.product.exception.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ProductValidationServlet")
public class ValidationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        ProductDTO productDTO= new ProductDTO();

        int productId = Integer.parseInt(req.getParameter("productId"));
        if (productId <= 0) {
            throw new ProductIdInvalidException("Product ID must be a positive integer.");
        } else {
            productDTO.setProductId(productId);
        }

        String productName = req.getParameter("productName");
        if (productName == null || productName.trim().isEmpty()) {
            throw new ProductNameInvalidException("Product name cannot be null or empty.");
        } else if (productName.length() < 3) {
            throw new ProductNameInvalidException("Product name must be at least 3 characters.");
        } else {
            productDTO.setProductName(productName);
        }


        double price = Double.parseDouble(req.getParameter("price"));
        if (price <= 0) {
            throw new PriceInvalidException("Price must be greater than 0.");
        } else if (price > 10000) {
            throw new PriceInvalidException("Price must not exceed 10000.");
        } else {
            productDTO.setPrice(price);
        }


        int quantity = Integer.parseInt(req.getParameter("quantity"));
        if (quantity < 0) {
            throw new QuantityInvalidException("Quantity must be >= 0.");
        } else if (quantity > 1000) {
            throw new QuantityInvalidException("Quantity must not exceed 1000.");
        } else {
            productDTO.setQuantity(quantity);
        }


        String category = req.getParameter("category");
        if (
                !("Electronics".equals(category) ||
                        "Clothing".equals(category) ||
                        "Books".equals(category) ||
                        "Home".equals(category))
        ) {
            throw new CategoryInvalidException("Category must be one of: Electronics, Clothing, Books, Home");
        } else {
            productDTO.setCategory(category);
        }

        writer.println("<h3>Product Validated and Accepted Successfully</h3>");

    }
}
