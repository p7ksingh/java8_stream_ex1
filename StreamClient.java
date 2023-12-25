package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamClient {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("hello");
        lines.add("world");
        lines.add(null);
        // find null
        lines.stream().filter(x -> x != null).forEach(x -> System.out.println(x));

    }
}
