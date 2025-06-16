package com.myworkz.earphone.service;

import com.myworkz.earphone.dto.EarPhoneDTO;

import java.util.Optional;

public interface EarPhoneService {
    boolean save(EarPhoneDTO earPhoneDTO);

    default Optional<EarPhoneDTO> findById(int id){
        return Optional.empty();
    }
}
