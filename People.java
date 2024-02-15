package com.example.demo;

import java.util.Comparator;
import java.util.List;

class People {

    public String name;
    public String city;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public People(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {

        List.of(new People("John", "Boston"),
                new People("Mary", "Boston"),
                new People("Anthony", "Boston"),
                new People("Monica", "Amsterdam"),
                new People("Seth", "São Paulo"))
                .stream()
                .sorted(Comparator.comparing(People::getCity))
                .map(People::getName)
                .forEach(System.out::println);
        System.out.println("=".repeat(40));
        List.of(new People("John", "Boston"),
                new People("Mary", "Boston"),
                new People("Anthony", "Boston"),
                new People("Monica", "Amsterdam"),
                new People("Seth", "São Paulo"))
                .stream()
                .sorted(Comparator.comparing(People::getCity)
                        .thenComparing(People::getName))
                .map(People::getName)
                .forEach(System.out::println);
        System.out.println("=".repeat(40));
        List.of(new People("John", "Boston"),
                new People("Mary", "Boston"),
                new People("Anthony", "Boston"),
                new People("Monica", "Amsterdam"),
                new People("Seth", "São Paulo"))
                .stream()
                .sorted(Comparator.comparing(People::getCity).reversed()
                        .thenComparing(Comparator.comparing(People::getName).reversed()))
                .map(People::getName)
                .forEach(System.out::println);
    }
}