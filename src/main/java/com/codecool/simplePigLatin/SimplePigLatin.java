package com.codecool.simplePigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {

    // Source: https://www.codewars.com/kata/520b9d2ad5c005041100000f

    public String translate(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> (!word.matches("[a-zA-Z]+")) ? word : word.substring(1) + word.substring(0, 1) + "ay")
                .collect(Collectors.joining(" "));
    }

}
