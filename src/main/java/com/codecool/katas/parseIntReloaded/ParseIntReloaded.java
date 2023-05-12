package com.codecool.katas.parseIntReloaded;

import java.util.Arrays;

public class ParseIntReloaded {

    // Source: https://www.codewars.com/kata/525c7c5ab6aecef16e0001a5/train/java

    public int parseToInt(String numberWord) {
        String[] splitNumberWords = splitWord(numberWord, " ");
        splitNumberWords = removeUnnecessaryWords(splitNumberWords);

        if (isSingleWord(splitNumberWords) && !numberWord.contains("-")) {              // numbers 0 - 20
            return convertDigit(numberWord);
        }

        if (isSingleWord(splitNumberWords) && numberWord.contains("-")) {               // numbers 21 - 99
            String[] splitNumber = splitWord(numberWord, "-");
            return convertDigit(splitNumber[0]) + convertDigit(splitNumber[1]);
        }

        return calculateSum(splitNumberWords);                                          // numbers 100+
    }

    private String[] splitWord(String numWord, String regex) {
        return numWord.split(regex);
    }

    private String[] removeUnnecessaryWords(String[] words) {
        return Arrays.stream(words)
                .filter(word -> !word.equals("and"))
                .toArray(String[]::new);
    }

    private boolean isSingleWord(String[] words) {
        return words.length == 1;
    }

    private int convertDigit(String digit) {
        return BasicNumbers.valueOf(digit).getValue();
    }

    private int calculateSum(String[] words) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            int number = parseToInt(words[i]);
            if (words[i].equals(BasicNumbers.hundred.toString())) {
                sum *= BasicNumbers.hundred.getValue();
            } else if (words[i].equals(BasicNumbers.thousand.toString())) {
                sum *= BasicNumbers.thousand.getValue();
            } else if (words[i].equals(BasicNumbers.million.toString())) {
                sum *= BasicNumbers.million.getValue();
            } else {
                sum += number;
            }

            try {
                if (words[i].equals(BasicNumbers.thousand.toString()) && words[i + 2].equals(BasicNumbers.hundred.toString())) {
                    sum /= BasicNumbers.hundred.getValue();
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }

        return sum;
    }

}
