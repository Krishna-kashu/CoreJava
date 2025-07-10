package com.my_work.mapps.dto;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonDTO {
    private String name;
    private String type;
    private String aadhaar;

    @Override
    public int hashCode() {
        System.out.println("running hashcode...");
        return Objects.hashCode(aadhaar);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals...");
        if(obj!=null){
            if(obj instanceof PersonDTO){
                PersonDTO person =(PersonDTO) obj;
                return this.name.equalsIgnoreCase(person.name);
            }
        }
        return false;
    }
}