package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.PastDateException;

import java.time.LocalDate;

public class BookingService {
    public void book(LocalDate bookingDate) throws PastDateException {
        if (bookingDate.isBefore(LocalDate.now())) {
            throw new PastDateException("Cannot book for a past date: " + bookingDate);
        }
        System.out.println("Booking confirmed for: " + bookingDate);
    }
}
