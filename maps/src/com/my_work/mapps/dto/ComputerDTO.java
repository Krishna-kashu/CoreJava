package com.my_work.mapps.dto;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ComputerDTO {
    private String name;
    private String processor;
    private int ramGB;
    private int storageGB;
    private String serialNumber;

    @Override
    public int hashCode() {
        System.out.println("Running hashCode...");
        return Objects.hashCode(serialNumber);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Running equals...");
        if (obj != null && obj instanceof ComputerDTO) {
            ComputerDTO other = (ComputerDTO) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
}
