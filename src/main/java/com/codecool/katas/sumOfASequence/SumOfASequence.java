package com.codecool.katas.sumOfASequence;

import java.util.stream.IntStream;

public class SumOfASequence {

    // Source: https://www.codewars.com/kata/586f6741c66d18c22800010a

    private boolean validParameters(int start, int end, int step) {
        return step > 0 && start <= end;
    }

    public int sumSequence_V1(int start, int end, int step) {
        if (!validParameters(start, end, step)) {
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }

        return sum;
    }

    public int sumSequence_V2(int start, int end, int step) {
        return (validParameters(start, end, step))
                ? IntStream.iterate(start, number -> number <= end, number -> number + step).sum()
                : 0;
    }

}

