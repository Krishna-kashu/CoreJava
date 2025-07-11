package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HouseDTO {
    private String type;
    private int floors;
    private String location;
    private SecurityDTO security;
}
