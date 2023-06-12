package com.codecool.katas.scramblies;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scramblies {

    // Source: https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java

    public boolean scramble(String firstWord, String secondWord) {
        Map<Character, Long> firstWordLetterCount = countLetters(firstWord);
        Map<Character, Long> secondWorLetterCount = countLetters(secondWord);
        return containsAllLetters(firstWordLetterCount, secondWorLetterCount);
    }

    private Map<Character, Long> countLetters(String word) {
        return word
                .chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private boolean containsAllLetters(Map<Character, Long> firstWordCounts, Map<Character, Long> secondLetterCounts) {
        return secondLetterCounts.entrySet().stream()
                .allMatch(entry -> firstWordCounts.containsKey(entry.getKey()) && firstWordCounts.get(entry.getKey()) >= entry.getValue());
    }

}
