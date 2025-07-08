package com.myworkz.myapp.repo;

import com.myworkz.myapp.dto.AppDTO;

import java.util.List;

public interface AppRepo {
    List<AppDTO> findAll();
}
