package com.codecool.descendingOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    // Source: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

    public int rearrangeDigits(int number) {
        return Arrays.stream(Integer.toString(number).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.collectingAndThen(Collectors.joining(), Integer::parseInt));
    }

}
