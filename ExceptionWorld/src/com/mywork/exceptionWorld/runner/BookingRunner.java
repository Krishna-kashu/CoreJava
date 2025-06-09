package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.PastDateException;
import com.mywork.exceptionWorld.service.BookingService;

import java.time.LocalDate;

public class BookingRunner {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        try {
            bookingService.book(LocalDate.of(2023, 5, 10)); // Past date
        } catch (PastDateException e) {
            System.out.println("Booking error: " + e.getMessage());
        }
    }
}
