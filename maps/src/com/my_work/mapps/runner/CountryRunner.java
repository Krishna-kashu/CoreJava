package com.my_work.mapps.runner;

import com.my_work.mapps.dto.CityDTO;
import com.my_work.mapps.dto.CountryDTO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryRunner {

    public static void main(String[] args) {

        List<CityDTO> list1 = Arrays.asList( new CityDTO("New York", 8500000, false),
                new CityDTO("Washington D.C.", 700000, true));
        List<CityDTO> list2 = Arrays.asList(new CityDTO("Tokyo", 13900000, true),
                new CityDTO("Osaka", 2700000, false));
        List<CityDTO> list3 = Arrays.asList(
                new CityDTO("Paris", 2140000, true),
                new CityDTO("Lyon", 500000, false)
        );

        List<CityDTO> list4 = Arrays.asList(
                new CityDTO("Berlin", 3760000, true),
                new CityDTO("Munich", 1470000, false)
        );

        List<CityDTO> list5 = Arrays.asList(
                new CityDTO("Delhi", 32000000, true),
                new CityDTO("Mumbai", 20000000, false)
        );

        // Add 20 more for total 25 entries
        List<CityDTO> list6 = Arrays.asList(new CityDTO("Beijing", 21500000, true), new CityDTO("Shanghai", 24800000, false));
        List<CityDTO> list7 = Arrays.asList(new CityDTO("London", 9300000, true), new CityDTO("Manchester", 550000, false));
        List<CityDTO> list8 = Arrays.asList(new CityDTO("Moscow", 12500000, true), new CityDTO("St. Petersburg", 5300000, false));
        List<CityDTO> list9 = Arrays.asList(new CityDTO("Rio de Janeiro", 6748000, false), new CityDTO("Brasília", 3050000, true));
        List<CityDTO> list10 = Arrays.asList(new CityDTO("Madrid", 6660000, true), new CityDTO("Barcelona", 5500000, false));
        List<CityDTO> list11 = Arrays.asList(new CityDTO("Rome", 2870000, true), new CityDTO("Milan", 1360000, false));
        List<CityDTO> list12 = Arrays.asList(new CityDTO("Seoul", 9770000, true), new CityDTO("Busan", 3400000, false));
        List<CityDTO> list13 = Arrays.asList(new CityDTO("Canberra", 430000, true), new CityDTO("Sydney", 5300000, false));
        List<CityDTO> list14 = Arrays.asList(new CityDTO("Cairo", 9900000, true), new CityDTO("Alexandria", 5100000, false));
        List<CityDTO> list15 = Arrays.asList(new CityDTO("Ottawa", 1000000, true), new CityDTO("Toronto", 6300000, false));
        List<CityDTO> list16 = Arrays.asList(new CityDTO("Ankara", 5600000, true), new CityDTO("Istanbul", 15400000, false));
        List<CityDTO> list17 = Arrays.asList(new CityDTO("Nairobi", 4400000, true), new CityDTO("Mombasa", 1200000, false));
        List<CityDTO> list18 = Arrays.asList(new CityDTO("Jakarta", 10700000, true), new CityDTO("Surabaya", 2800000, false));
        List<CityDTO> list19 = Arrays.asList(new CityDTO("Bangkok", 8300000, true), new CityDTO("Chiang Mai", 1300000, false));
        List<CityDTO> list20 = Arrays.asList(new CityDTO("Baghdad", 8800000, true), new CityDTO("Basra", 2600000, false));
        List<CityDTO> list21 = Arrays.asList(new CityDTO("Tehran", 9000000, true), new CityDTO("Mashhad", 3000000, false));
        List<CityDTO> list22 = Arrays.asList(new CityDTO("Lagos", 21000000, false), new CityDTO("Abuja", 1230000, true));
        List<CityDTO> list23 = Arrays.asList(new CityDTO("Dhaka", 21000000, true), new CityDTO("Chittagong", 8200000, false));
        List<CityDTO> list24 = Arrays.asList(new CityDTO("Karachi", 16000000, false), new CityDTO("Islamabad", 1200000, true));
        List<CityDTO> list25 = Arrays.asList(new CityDTO("Kuala Lumpur", 1800000, true), new CityDTO("Penang", 1600000, false));

        CountryDTO c1 = new CountryDTO("USA", "North America", 331);
        CountryDTO c2 = new CountryDTO("Japan", "Asia", 126);
        CountryDTO c3 = new CountryDTO("France", "Europe", 67);
        CountryDTO c4 = new CountryDTO("Germany", "Europe", 83);
        CountryDTO c5 = new CountryDTO("India", "Asia", 1400);
        CountryDTO c6 = new CountryDTO("China", "Asia", 1440);
        CountryDTO c7 = new CountryDTO("UK", "Europe", 68);
        CountryDTO c8 = new CountryDTO("Russia", "Europe/Asia", 145);
        CountryDTO c9 = new CountryDTO("Brazil", "South America", 213);
        CountryDTO c10 = new CountryDTO("Spain", "Europe", 47);
        CountryDTO c11 = new CountryDTO("Italy", "Europe", 60);
        CountryDTO c12 = new CountryDTO("South Korea", "Asia", 52);
        CountryDTO c13 = new CountryDTO("Australia", "Oceania", 26);
        CountryDTO c14 = new CountryDTO("Egypt", "Africa", 104);
        CountryDTO c15 = new CountryDTO("Canada", "North America", 38);
        CountryDTO c16 = new CountryDTO("Turkey", "Europe/Asia", 85);
        CountryDTO c17 = new CountryDTO("Kenya", "Africa", 54);
        CountryDTO c18 = new CountryDTO("Indonesia", "Asia", 273);
        CountryDTO c19 = new CountryDTO("Thailand", "Asia", 70);
        CountryDTO c20 = new CountryDTO("Iraq", "Asia", 41);
        CountryDTO c21 = new CountryDTO("Iran", "Asia", 85);
        CountryDTO c22 = new CountryDTO("Nigeria", "Africa", 206);
        CountryDTO c23 = new CountryDTO("Bangladesh", "Asia", 166);
        CountryDTO c24 = new CountryDTO("Pakistan", "Asia", 220);
        CountryDTO c25 = new CountryDTO("Malaysia", "Asia", 32);

        Map<CountryDTO, List<CityDTO>> countryMap = new HashMap<>();

        countryMap.put(c1, list1);
        countryMap.put(c2, list2);
        countryMap.put(c3, list3);
        countryMap.put(c4, list4);
        countryMap.put(c5, list5);
        countryMap.put(c6, list6);
        countryMap.put(c7, list7);
        countryMap.put(c8, list8);
        countryMap.put(c9, list9);
        countryMap.put(c10, list10);
        countryMap.put(c11, list11);
        countryMap.put(c12, list12);
        countryMap.put(c13, list13);
        countryMap.put(c14, list14);
        countryMap.put(c15, list15);
        countryMap.put(c16, list16);
        countryMap.put(c17, list17);
        countryMap.put(c18, list18);
        countryMap.put(c19, list19);
        countryMap.put(c20, list20);
        countryMap.put(c21, list21);
        countryMap.put(c22, list22);
        countryMap.put(c23, list23);
        countryMap.put(c24, list24);
        countryMap.put(c25, list25);

        System.out.println("Countries and their major cities:");
        countryMap.forEach((country, cities) -> {
            System.out.println(country.getName() + " - " + country.getContinent() + " :");
            cities.forEach(city -> System.out.println("    " + city.getName() + " - \t Capital: " + city.isCapital() + " "));
        });
    }
}