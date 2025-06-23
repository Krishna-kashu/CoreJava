package com.myworkz.queryhub.dto;


/*

Create a Collection of Camping Accessories (5 properties) with 10 elements
Loop it and print it on Console

Create a Collection of furniture  (5 properties) with 10 elements
Loop it and print it on Console

Create a Collection of appliances  (5 properties) with 10 elements
Loop it and print it on Console

Create a Collection of your choice  (5 properties) with 10 elements
Loop it and print it on Console
*/


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SareeDTO {
    private String material;
    private String name;
    private double cost;
    private String pattern;
    private String color;
    private String occasion;
}
