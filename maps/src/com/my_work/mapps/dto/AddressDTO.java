package com.my_work.mapps.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class AddressDTO {
    private int no;
    private String street;
    private String city;
    private int pinCode;
}
