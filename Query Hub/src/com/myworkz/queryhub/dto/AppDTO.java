package com.myworkz.queryhub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppDTO {
    private String name;
    private String type;
    private AppVersion version;
    private LocalDate releaseDate;
    private double size;
    private boolean isFree;
    private double costPerPerson;
    private List<AppOwner> owner;
}
