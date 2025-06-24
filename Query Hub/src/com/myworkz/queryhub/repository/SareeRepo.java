package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.SareeDTO;
import java.util.Collection;

public interface SareeRepo {
    Collection<SareeDTO> findAll();
}
