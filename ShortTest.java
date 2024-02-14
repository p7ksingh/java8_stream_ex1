package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortTest {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("London", "Sydney", "Colombo", "Cairo", "Beijing");

        cities.stream().sorted().forEach(System.out::println);

        cities.stream().filter(a -> a.startsWith("C")).map(String::toUpperCase).sorted().forEach(System.out::println);

        // Group cities by name
        Map<String, List<String>> groupedCities = cities.stream()
                .collect(Collectors.groupingBy(city -> city));

        // Print the grouped cities
        groupedCities.forEach((name, list) -> {
            System.out.println(name + ": " + list);
        });
    }
}
