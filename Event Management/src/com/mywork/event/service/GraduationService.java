package com.mywork.event.service;

import com.mywork.event.dto.GraduationDTO;

import java.util.Optional;

public interface GraduationService {
    boolean save(GraduationDTO graduationDTO);

    default Optional<GraduationDTO> findById(int id){
        return  Optional.empty();
    }
}
