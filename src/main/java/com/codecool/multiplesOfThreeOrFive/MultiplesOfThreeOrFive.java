package com.codecool.multiplesOfThreeOrFive;

import java.util.stream.IntStream;

public class MultiplesOfThreeOrFive {

    private final int FIRST_DIVISOR = 3;
    private final int SECOND_DIVISOR = 5;

    public int sumMultiples_boringSolution(int maxNumber) {
        int sum = 0;
        for (int number = 0; number < maxNumber; number++) {
            if (number % FIRST_DIVISOR == 0 || number % SECOND_DIVISOR == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public int sumMultiples(int maxNumber) {
        return IntStream.range(0, maxNumber)
                .filter(number -> (number % FIRST_DIVISOR == 0) || (number % SECOND_DIVISOR == 0))
                .sum();
    }

}
