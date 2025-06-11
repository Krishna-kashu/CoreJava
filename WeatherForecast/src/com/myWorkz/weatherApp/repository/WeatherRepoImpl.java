package com.myWorkz.weatherApp.repository;

import com.myWorkz.weatherApp.dto.WeatherDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WeatherRepoImpl implements WeatherRepo{
    @SneakyThrows
    @Override
    public String persist(WeatherDTO weatherDTO) {
        System.out.println("Running persist method in WeatherRepoImpl");
        if(weatherDTO!=null){
            System.out.println("weatherDTO is not null");
            String url = "jdbc:mysql://localhost:3306/weather_forecast";
            String username="root";
            String password="Krishna@2002";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url,username,password);
                String sql = "insert into weather_info_table values(0, )";
                Statement statement =connection.createStatement();

                statement.executeUpdate(sql);


            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("WeatherDTO is not null");
        }
        return "success";
    }
}
