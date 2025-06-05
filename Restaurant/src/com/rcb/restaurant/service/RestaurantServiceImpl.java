package com.rcb.restaurant.service;

import com.rcb.restaurant.dto.RestaurantDTO;
import com.rcb.restaurant.exception.InvalidBookingException;
import com.rcb.restaurant.exception.InvalidNameException;
import com.rcb.restaurant.exception.InvalidRatingException;
import com.rcb.restaurant.exception.InvalidTimeException;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public boolean validateAndSave(RestaurantDTO dto) throws InvalidNameException, InvalidRatingException, InvalidTimeException, InvalidBookingException {
        if (dto == null) {
            throw new NullPointerException("DTO is null");
        }

        //name
        if (dto.getName() == null){
            throw new InvalidNameException("Name is null");
        }
        if (dto.getName().length() < 3){
            throw new InvalidNameException("Name too short");
        }
        if (dto.getName().length() > 25) {
            throw new InvalidNameException("Name too long");
        }
        if (Character.isDigit(dto.getName().charAt(0))) {
            throw new InvalidNameException("Name starts with number");
        }

        // Rating
        if (dto.getRating() < 3){
            throw new InvalidRatingException("Rating must be >= 3");
        }

        // FoodMenu
        String[] foodMenu = dto.getFoodMenu();
        if (foodMenu == null || foodMenu.length == 0) {
            throw new NullPointerException("Food Menu is null or empty");
        }

        // Time
        LocalTime opening = dto.getOpeningTime();
        LocalTime closing = dto.getClosingTime();
        if (opening != null && opening.isBefore(LocalTime.of(9, 0))) {
            throw new InvalidTimeException("Opening time is before 9 AM");
        }
        if (closing != null && closing.isAfter(LocalTime.of(12, 0))) {
            throw new InvalidTimeException("Closing time is after 12 PM");
        }

        // Booking
        LocalDate bookedDate = dto.getBookedDate();
        if (bookedDate != null && bookedDate.isBefore(LocalDate.now())) {
            throw new InvalidBookingException("Booking date is in the past");
        }

        LocalTime bookedTime = dto.getBookedTime();
        if (bookedTime != null &&
                (bookedTime.isBefore(LocalTime.of(9, 0)) || bookedTime.isAfter(LocalTime.of(12, 0)))) {
            throw new InvalidBookingException("Booking time must be between 9 AM and 12 PM");
        }

        System.out.println("All validations passed ");
        return true;
    }
}