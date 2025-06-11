package com.myWorkz.weatherApp.servlet;

import com.myWorkz.weatherApp.dto.WeatherDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns="/weather", loadOnStartup = 1)
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost method in WeatherServlet");

        String placeName = req.getParameter("placeName");
        String weather = req.getParameter("weather");
        String minTemp = req.getParameter("minTemp");
        String maxTemp = req.getParameter("maxTemp");
        String cloudy = req.getParameter("cloudy");
        String raining = req.getParameter("raining");
        String rainMM = req.getParameter("rainMM");
        String humidity = req.getParameter("humidity");
        String windSpeed = req.getParameter("windSpeed");
        String sunriseTime = req.getParameter("sunriseTime");
        String sunsetTime = req.getParameter("sunsetTime");
        String moonRiseTime = req.getParameter("moonRiseTime");
        String moonSetTime = req.getParameter("moonSetTime");
        String rainStartTime = req.getParameter("rainStartTime");
        String rainEndTime = req.getParameter("rainEndTime");
        String precipitation = req.getParameter("precipitation");

        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setPlaceName(placeName);
        weatherDTO.setWeather(weather);
        weatherDTO.setMinTemp(minTemp);
        weatherDTO.setMaxTemp(maxTemp);
        weatherDTO.setCloudy(cloudy);
        weatherDTO.setRaining(raining);
        weatherDTO.setRainInMM(rainMM);
        weatherDTO.setHumidity(humidity);
        weatherDTO.setWindSpeed(windSpeed);
        weatherDTO.setSunRiseTime(sunriseTime);
        weatherDTO.setSunSetTime(sunsetTime);
        weatherDTO.setMoonRiseTime(moonRiseTime);
        weatherDTO.setMoonSetTime(moonSetTime);
        weatherDTO.setRainStartTime(rainStartTime);
        weatherDTO.setRainEndTime(rainEndTime);
        weatherDTO.setPrecipitation(precipitation);

    }
}
