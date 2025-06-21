package com.mywork.event.repository;

import com.mywork.event.dto.GraduationDTO;

import java.util.Optional;

public interface GraduationRepo {
    boolean persist(GraduationDTO graduationDTO);

    default Optional<GraduationDTO> findById(int id){
        return  Optional.empty();
    }
}
