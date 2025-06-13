package com.myworkz.earphone.repository;

import com.myworkz.earphone.dto.EarPhoneDTO;

public interface EarPhoneRepo {
    boolean persist(EarPhoneDTO earPhoneDTO);
}
