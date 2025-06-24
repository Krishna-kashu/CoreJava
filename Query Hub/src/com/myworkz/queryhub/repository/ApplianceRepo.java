package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.ApplianceDTO;
import java.util.Collection;

public interface ApplianceRepo {
    Collection<ApplianceDTO> findAll();

}
