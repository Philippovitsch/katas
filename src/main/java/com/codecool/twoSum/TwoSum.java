package com.codecool.twoSum;

public class TwoSum {

    // Source: https://www.codewars.com/kata/52c31f8e6605bcc646000082

    public int[] calculate(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

}
