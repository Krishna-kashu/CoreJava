package com.rcb.restaurant.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
    private String name;
    private String location;
    private double contactDetails;
    private String email;
    private double rating;
    private String[] foodMenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;


    public String toString() {
        return "RestaurantDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contactDetails=" + contactDetails +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                ", foodMenu=" + Arrays.toString(foodMenu) +
                ", type='" + type + '\'' +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", bookedDate=" + bookedDate +
                ", bookedTime=" + bookedTime +
                '}';

    }
}