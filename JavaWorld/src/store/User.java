package store;

import materials.Weather;

import java.util.Objects;

public class User {
    public void weatherCheck(Weather weather){
        if(Objects.nonNull(weather)){
            System.out.println("weatherCheck in User is running");
            weather.forecast();
        }else{
            System.out.println("weather object is null can not forecast");
        }

    }
}
