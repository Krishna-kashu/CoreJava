package com.rcb.restaurant.runner;


import com.rcb.restaurant.dto.RestaurantDTO;
import com.rcb.restaurant.exception.InvalidBookingException;
import com.rcb.restaurant.exception.InvalidNameException;
import com.rcb.restaurant.exception.InvalidRatingException;
import com.rcb.restaurant.exception.InvalidTimeException;
import com.rcb.restaurant.service.RestaurantService;
import com.rcb.restaurant.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {

        RestaurantDTO dto = new RestaurantDTO();
        dto.setName("RCB Cafe");
        dto.setLocation("Bangalore");
        dto.setContactDetails(999999999);
        dto.setEmail("rcb@cafe.com");
        dto.setRating(4.5);
        dto.setFoodMenu(new String[]{"Burger","Pizza","Coffee"});
        dto.setType("Cafe");
        dto.setOpeningTime(LocalTime.parse("09:00"));
        dto.setClosingTime(LocalTime.parse("12:00"));
        dto.setBookedDate(LocalDate.parse("2025-06-05"));
        dto.setBookedTime(LocalTime.parse("10:30"));

        RestaurantService service = new RestaurantServiceImpl();
        try {
            service.validateAndSave(dto);
        } catch (InvalidNameException | InvalidRatingException | InvalidTimeException | InvalidBookingException ex) {
            System.err.println("Validation failed: " + ex.getMessage());
        }
    }
}
