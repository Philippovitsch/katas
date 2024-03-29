package com.codecool.katas.betweenExtremes;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BetweenExtremes {

    // Source: https://www.codewars.com/kata/56d19b2ac05aed1a20000430

    public int getMaxDifference(int[] numbers) {
        int minValue = getMinValue(numbers);
        int maxValue = getMaxValue(numbers);
        return maxValue - minValue;
    }

    private int getMinValue(int[] numbers) {
        return Arrays.stream(numbers)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    private int getMaxValue(int[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

}
