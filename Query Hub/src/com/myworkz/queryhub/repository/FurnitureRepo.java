package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.FurnitureDTO;
import java.util.Collection;

public interface FurnitureRepo {
    Collection<FurnitureDTO> findAll();
}
