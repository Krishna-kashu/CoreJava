package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.GadgetDTO;
import java.util.Collection;

public interface GadgetRepo {
    Collection<GadgetDTO> findAll();
}
