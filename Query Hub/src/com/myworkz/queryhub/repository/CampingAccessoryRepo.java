package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.CampingAccessoryDTO;

import java.util.Collection;

public interface CampingAccessoryRepo {
    Collection<CampingAccessoryDTO> findAll();
}
