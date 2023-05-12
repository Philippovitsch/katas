package com.codecool.katas.stopSpinningMyWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StopSpinningMyWords {

    // Source: https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

    private final int minWordSize = 5;

    public String reverseSpecificWords(String words) {
        List<String> wordsArr = Arrays.asList(words.split(" "));
        List<String> reversedWordsArr = wordsArr.stream().map(word -> {
            if (word.length() < minWordSize) {
                return word;
            }
            return reverseWord(word);
        }).toList();

        return String.join(" ", reversedWordsArr);
    }

    private String reverseWord(String word) {
        List<Character> characters = new ArrayList<>();
        for (char character : word.toCharArray()) {
            characters.add(character);
        }

        Collections.reverse(characters);

        StringBuilder result = new StringBuilder();
        for(char character : characters) {
            result.append(character);
        }

        return result.toString();
    }

}
