package com.codecool.katas.soManyPermutations;

import java.util.ArrayList;
import java.util.List;

public class SoManyPermutations {

    // Source: https://www.codewars.com/kata/5254ca2719453dcc0b00027d

    public List<String> permute(String word) {
        if (word.length() == 0) {
            return new ArrayList<>(List.of(""));
        }

        char firstChar = word.charAt(0);
        String subWord = word.substring(1);
        List<String> previousWords = permute(subWord);
        List<String> resultantWords = new ArrayList<>();

        for (String currentWord : previousWords) {
            for (int i = 0; i <= currentWord.length(); i++) {
                resultantWords.add(currentWord.substring(0, i) + firstChar + currentWord.substring(i));
            }
        }

        return resultantWords.stream()
                .distinct()
                .toList();
    }

}
