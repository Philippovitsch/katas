package com.codecool.maximumSubarraySum;

import java.util.Arrays;

public class MaximumSubarraySum {

    // Source: https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

    public int calculate(int[] numbers) {
        int sum = 0;
        int sequenceSize = 2;
        while (sequenceSize <= numbers.length) {
            for (int i = 0; i < numbers.length - sequenceSize + 1; i++) {
                int tempSum = Arrays.stream(Arrays.copyOfRange(numbers, i, i + sequenceSize)).sum();
                sum = Math.max(tempSum, sum);
            }
            sequenceSize++;
        }
        return sum;
    }

}
