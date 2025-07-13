package com.my_work.mapps.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentDTO {
    private String name;
    private int numberOfStudents;
    private String hod;
}