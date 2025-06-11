package com.myWorkz.weatherApp.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {
    private String placeName;
    private String weather;
    private Float minTemp;
    private Float maxTemp;
    private Boolean cloudy;
    private Boolean raining;
    private Float rainInMM;
    private Float humidity;
    private Float windSpeed;
    private String sunRiseTime;
    private String sunSetTime;
    private String moonRiseTime;
    private String moonSetTime;
    private String rainStartTime;
    private String rainEndTime;
    private Float precipitation;
}
