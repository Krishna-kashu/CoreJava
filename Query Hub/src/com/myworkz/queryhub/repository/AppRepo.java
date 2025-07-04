package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.AppDTO;

import java.util.List;

public interface AppRepo {
    List<AppDTO> findAll();
}
