package com.codecool.katas.isograms;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Isograms {

    // Source: https://www.codewars.com/kata/54ba84be607a92aa900000f1

    public boolean isIsogram_V1(String text) {
        return text.toLowerCase()
                .chars()
                .mapToObj(character -> (char) character)
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .allMatch(entry -> entry.getValue() < 2);
    }

    public boolean isIsogram_V2(String text) {
        return text.length() == text.toLowerCase()
                .chars()
                .distinct()
                .count();
    }

}
