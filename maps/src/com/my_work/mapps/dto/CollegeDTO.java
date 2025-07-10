package com.my_work.mapps.dto;

import lombok.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CollegeDTO {
    private String name;
    private String location;
    private int establishedYear;

    @Override
    public int hashCode() {
        System.out.println("Running hashCode...");
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Running equals...");
        if (obj != null && obj instanceof CollegeDTO) {
            CollegeDTO other = (CollegeDTO) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
}