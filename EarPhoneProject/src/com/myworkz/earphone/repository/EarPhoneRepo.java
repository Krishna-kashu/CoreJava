package com.myworkz.earphone.repository;

import com.myworkz.earphone.dto.EarPhoneDTO;

import java.util.Optional;

public interface EarPhoneRepo {
    boolean persist(EarPhoneDTO earPhoneDTO);

    default Optional<EarPhoneDTO> findById(int id){
        return Optional.empty();
    }
}
