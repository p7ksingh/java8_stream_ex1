package com.java8.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapClient {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(4, "D");
        map.put(3, "C");
        map.put(2, "B");
        map.put(5, "E");
        map.put(8, "H");
        map.put(7, "K");
        System.out.println(map);
        map.keySet().stream().forEach(dt -> System.out.println(dt));
        map.values().stream().forEach(dt -> System.out.println(dt));
        map.entrySet().stream().forEach(dt -> System.out.println(dt));
        // display data in accending order java8 feature
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(dt -> System.out.println(dt));
        System.out.println("=".repeat(40));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(dt -> System.out.println(dt));
        // reverse order
        System.out.println("=".repeat(40));
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                .forEach(dt -> System.out.println(dt));

        // How to convert map tpo list
        List<String> collect = map.values().stream().collect(Collectors.toList());
        System.out.println(collect);
    }
}
