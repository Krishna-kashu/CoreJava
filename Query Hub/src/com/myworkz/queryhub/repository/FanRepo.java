package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.FanDTO;

import java.util.Collection;

public interface FanRepo {
    Collection<FanDTO> findAll();
}
