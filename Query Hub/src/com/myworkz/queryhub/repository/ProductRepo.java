package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.ProductDTO;
import java.util.List;

public interface ProductRepo {
   List<ProductDTO> findAll();
}