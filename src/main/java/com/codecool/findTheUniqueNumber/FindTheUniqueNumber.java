package com.codecool.findTheUniqueNumber;

import java.util.List;
import java.util.stream.DoubleStream;

public class FindTheUniqueNumber {

    public double findUniqueNumber(double[] numbers) {
        if (numbers.length < 3) {
            throw new IllegalArgumentException("Array is too short!");
        }

        List<Double> numbersList = DoubleStream.of(numbers).boxed().sorted().toList();

        if (!numbersList.get(0).equals(numbersList.get(1))) {
            return numbersList.get(0);
        }

        if (!numbersList.get(numbersList.size() - 1).equals(numbersList.get(numbersList.size() - 2))) {
            return numbersList.get(numbersList.size() - 1);
        }

        throw new IllegalArgumentException("No unique number found!");
    }

}
