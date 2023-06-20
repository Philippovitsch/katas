package com.codecool.katas.reverseOrRotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrRotate {

    // Source: https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991

    public String shuffle(String numbers, int chunkSize) {
        if (chunkSize <= 0 || chunkSize > numbers.length()) {
            return "";
        }
        List<String> chunks = getChunks(numbers, chunkSize);
        return chunks.stream()
                .map(chunk -> (getSumOfCubes(chunk) % 2 == 0) ? reverseNumbers(chunk) : rotateNumbers(chunk))
                .collect(Collectors.joining(""));

    }

    private List<String> getChunks(String numbers, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        for (int i = chunkSize; i <= numbers.length(); i += chunkSize) {
            chunks.add(numbers.substring(i - chunkSize, i));
        }
        return chunks;
    }

    private int getSumOfCubes(String numbers) {
        return Arrays.stream(numbers.split(""))
                .mapToInt(Integer::valueOf)
                .sum();

    }

    private String reverseNumbers(String numbers) {
        StringBuilder stringBuilder = new StringBuilder(numbers);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private String rotateNumbers(String numbers) {
        return numbers.substring(1) + numbers.charAt(0);
    }

}
