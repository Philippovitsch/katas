package com.codecool.sortTheOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

    // Source: https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

    public Integer[] sort(Integer[] numbers) {
        Integer[] result = new Integer[numbers.length];
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[i] = numbers[i];
            } else {
                temp.add(numbers[i]);
            }
        }

        Collections.sort(temp);

        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = temp.remove(0);
            }
        }

        System.out.println("Your input: " + Arrays.toString(numbers));
        System.out.println("Sorted: " + Arrays.toString(result));

        return result;
    }

}
