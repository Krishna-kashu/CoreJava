package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.SareeDTO;
import com.myworkz.queryhub.repository.SareeRepo;
import com.myworkz.queryhub.repository.SareeRepoImpl;

import java.util.Collection;
import java.util.Comparator;

public class SareeStreamRunner {
    public static void main(String[] args) {

        SareeRepo sareeRepo = new SareeRepoImpl();

        Collection<SareeDTO> collection = sareeRepo.findAll();

        collection.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}