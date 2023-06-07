package com.codecool.katas.asciiBetizer;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class AsciiBetizer {

    // Source: https://www.codewars.com/kata/5e2e6a05e81eda00153daa5c

    public String[] sort(String words) {
        return Arrays.stream(words.split(" "))
                .distinct()
                .collect(Collectors.toMap(word -> word, word -> word.chars().sum()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }

}
