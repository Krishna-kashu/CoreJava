package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.RatingService;

public class RatingRunner {
    public static void main(String[] args) {
        new RatingService().acceptRating();
    }
}
