package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamClient2 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("us");
        lines.add("india");
        lines.add("uk");
        lines.add("us");
        lines.add(null);
        lines.add("india");
        lines.add("india");
        // remove dublicate element and null elements from arraylist
        lines.stream().filter(dt -> dt != null).distinct().forEach(dt -> System.out.println(dt));

    }
}
