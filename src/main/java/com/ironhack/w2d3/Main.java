package com.ironhack.w2d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Enums

        User user = new User("Adrián");
        System.out.println("User name: " + user.getName() + " status: " + user.getStatus());

        Category category = Category.GOLD;
        System.out.println("Category: " + category + " Points: " + category.points);

//        HashMaps
        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("India", "Ram Nath Kovind");
        nationalLeaders.put("Japan", "Shinzō Abe");
        nationalLeaders.put("Ecuador", "Lenín Moreno");
        nationalLeaders.put("Botswana", "Mokgweetsi Masisi");

        System.out.println(nationalLeaders);

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });

//        nationalLeaders.keySet();

        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");

        Map<String, Country> countryMap = new HashMap<>();

        countryMap.put(india.getCountryName(), india);
        countryMap.put(botswana.getCountryName(), botswana);
        countryMap.put(japan.getCountryName(), japan);

        System.out.println(countryMap);
    }
}
