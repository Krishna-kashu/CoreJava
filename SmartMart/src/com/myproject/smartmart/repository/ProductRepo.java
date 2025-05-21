package com.myproject.smartmart.repository;

import com.myproject.smartmart.dto.ProductDTO;

public interface ProductRepo {
    boolean persist(ProductDTO productDTO);
}
