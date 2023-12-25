package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamClient4 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("us");
        lines.add("india");
        lines.add("uk");
        lines.add("us");
        lines.add(null);
        lines.add("india");
        lines.add("india");
        lines.add("japan");
        // remove dublicate element and null elements and short data from arraylist
        lines.stream().filter(dt -> dt != null).distinct().sorted().map(dt ->dt.toUpperCase()).forEach(dt -> System.out.println(dt));

    }
}
