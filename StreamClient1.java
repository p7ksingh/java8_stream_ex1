package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamClient1 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("us");
        lines.add("india");
        lines.add("uk");
        lines.add("us");
        // remove dublicate element from arraylist
        lines.stream().distinct().forEach(dt -> System.out.println(dt));

    }
}
