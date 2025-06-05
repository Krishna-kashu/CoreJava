package com.rcb.restaurant.service;

import com.rcb.restaurant.dto.RestaurantDTO;
import com.rcb.restaurant.exception.InvalidBookingException;
import com.rcb.restaurant.exception.InvalidNameException;
import com.rcb.restaurant.exception.InvalidRatingException;
import com.rcb.restaurant.exception.InvalidTimeException;

public interface RestaurantService {
    boolean validateAndSave(RestaurantDTO restaurantDTO)
            throws InvalidNameException, InvalidRatingException, InvalidTimeException, InvalidBookingException;
}
