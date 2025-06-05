package com.product.servlet;

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
public class ValidationServletRunner extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException,
            ProductIdInvalidException,
            ProductNameInvalidException,
            PriceInvalidException,
            QuantityInvalidException,
            CategoryInvalidException,
            DuplicateProductException,
            NameTooShortException,
            NameContainsSpecialCharException,
            PriceTooHighForCategoryException,
            FreeProductWithoutReasonException,
            InvalidStockLevelException,
            NegativeDiscountException,
            NullDescriptionException
            {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        ProductDTO productDTO = new ProductDTO();

        int productId = Integer.parseInt(req.getParameter("productId"));
        if (productId <= 0) {
            throw new ProductIdInvalidException("Product ID must be a positive integer.");
        } else if (productId == 999) {
            throw new DuplicateProductException("Product ID 999 already exists.");
        } else {
            productDTO.setProductId(productId);
        }

        String productName = req.getParameter("productName");
        if (productName == null || productName.trim().isEmpty()) {
            throw new ProductNameInvalidException("Product name cannot be null or empty.");
        } else if (productName.length() < 3) {
            throw new ProductNameInvalidException("Product name must be at least 3 characters.");
        } else if (productName.length() < 5) { // ✅ NEW
            throw new NameTooShortException("Product name must be at least 5 characters.");
        } else if (!productName.matches("[a-zA-Z0-9 ]+")) {
            throw new NameContainsSpecialCharException("Product name contains invalid characters.");
        } else {
            productDTO.setProductName(productName);
        }

        double price = Double.parseDouble(req.getParameter("price"));
        if (price <= 0) {
            throw new PriceInvalidException("Price must be greater than 0.");
        } else if (price > 10000) {
            throw new PriceInvalidException("Price must not exceed 10000.");
        }

        String category = req.getParameter("category");
        if (!("Electronics".equals(category) || "Clothing".equals(category) ||
                "Books".equals(category) || "Home".equals(category))) {
            throw new CategoryInvalidException("Category must be one of: Electronics, Clothing, Books, Home");
        } else if ("Books".equals(category) && price > 2000) {
            throw new PriceTooHighForCategoryException("Books cannot be priced above ₹2000.");
        } else if ("Clothing".equals(category) && price > 5000) {
            throw new PriceTooHighForCategoryException("Clothing cannot be priced above ₹5000.");
        } else {
            productDTO.setCategory(category);
        }

        if (price == 0.0) {
            String reason = req.getParameter("reason");
            if (reason == null || reason.trim().isEmpty()) {
                throw new FreeProductWithoutReasonException("If the product is free, a reason must be provided.");
            }
        } else {
            productDTO.setPrice(price);
        }

        int quantity = Integer.parseInt(req.getParameter("quantity"));
        if (quantity < 0) {
            throw new QuantityInvalidException("Quantity must be >= 0.");
        } else if (quantity > 1000) {
            throw new QuantityInvalidException("Quantity must not exceed 1000.");
        } else if (price < 10 && quantity > 500) {
            throw new InvalidStockLevelException("Low-price products cannot have such high quantity.");
        } else {
            productDTO.setQuantity(quantity);
        }


        String discountStr = req.getParameter("discount");
        if (discountStr != null) {
            double discount = Double.parseDouble(discountStr);
            if (discount < 0) {
                throw new NegativeDiscountException("Discount cannot be negative.");
            }
        }


        String description = req.getParameter("description");
        if (description == null || description.trim().isEmpty()) {
            throw new NullDescriptionException("Product description cannot be null or empty.");
        }

        writer.println("Product Validated and Accepted Successfully");
    }
}
