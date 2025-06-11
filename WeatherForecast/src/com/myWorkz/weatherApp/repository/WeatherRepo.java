package com.myWorkz.weatherApp.repository;

import com.myWorkz.weatherApp.dto.WeatherDTO;

public interface WeatherRepo {
    String persist(WeatherDTO weatherDTO);
}
