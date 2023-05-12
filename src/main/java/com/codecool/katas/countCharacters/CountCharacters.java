package com.codecool.katas.countCharacters;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {

    // Source: https://www.codewars.com/kata/52efefcbcdf57161d4000091

    public Map<Character, Integer> count(String characters) {
        return characters
                .chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
    }

}
