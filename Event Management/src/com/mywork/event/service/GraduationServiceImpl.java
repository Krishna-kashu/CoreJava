package com.mywork.event.service;

import com.mywork.event.dto.GraduationDTO;
import com.mywork.event.repository.GraduationRepo;
import com.mywork.event.repository.GraduationRepoImpl;

import java.util.Optional;

public class GraduationServiceImpl implements GraduationService{
    @Override
    public boolean save(GraduationDTO graduationDTO) {
        boolean valid = true;

        if (graduationDTO == null) {
            System.out.println("DTO is null");
            return false;
        }
        System.out.println("Data is valid, will save into database using repo");
        GraduationRepo graduationRepo = new GraduationRepoImpl();
        boolean repo = graduationRepo.persist(graduationDTO);
        return valid;
    }

    @Override
    public Optional<GraduationDTO> findById(int id) {

        System.out.println("running findById in GraduationServiceImpl");

        if(id>0){
            System.out.println("id is valid: "+id);
            GraduationRepo graduationRepo = new GraduationRepoImpl();
            return  graduationRepo.findById(id);
        }
        return GraduationService.super.findById(id);
    }
}
