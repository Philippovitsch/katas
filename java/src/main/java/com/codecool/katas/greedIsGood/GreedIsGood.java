package com.codecool.katas.greedIsGood;

import java.util.Arrays;

public class GreedIsGood {

    // Source: https://www.codewars.com/kata/5270d0d18625160ada0000e4

    public int getScore(int[] diceThrows) {
        int sum = 0;

        sum += (countNumbers(diceThrows, 1) * 100);
        sum += (countNumbers(diceThrows, 5) * 50);

        if (countNumbers(diceThrows, 1) >= 3) {
            sum += 700;
        }
        if (countNumbers(diceThrows, 2) >= 3) {
            sum += 200;
        }
        if (countNumbers(diceThrows, 3) >= 3) {
            sum += 300;
        }
        if (countNumbers(diceThrows, 4) >= 3) {
            sum += 400;
        }
        if (countNumbers(diceThrows, 5) >= 3) {
            sum += 350;
        }
        if (countNumbers(diceThrows, 6) >= 3) {
            sum += 600;
        }

        return sum;
    }

    private long countNumbers(int[] diceThrows, int neededNumber) {
        return Arrays.stream(diceThrows)
                .filter(diceThrow -> diceThrow == neededNumber)
                .count();
    }

}
