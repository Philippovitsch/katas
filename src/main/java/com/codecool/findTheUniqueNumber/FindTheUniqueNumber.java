package com.codecool.findTheUniqueNumber;

import java.util.List;
import java.util.stream.DoubleStream;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindTheUniqueNumber {

    public double findUniqueNumber(double[] numbers) {
        if (numbers.length < 3) {
            throw new IllegalArgumentException("Array is too short!");
        }

        return DoubleStream.of(numbers)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No unique number found!"))
                .getKey();
    }

    public double findUniqueNumber_old(double[] numbers) {
        if (numbers.length < 3) {
            throw new IllegalArgumentException("Array is too short!");
        }

        List<Double> numbersList = DoubleStream.of(numbers).boxed().sorted().toList();
        double firstNumber = numbersList.get(0);
        double secondNumber = numbersList.get(1);
        double lastNumber = numbersList.get(numbersList.size() - 1);
        double secondToLastNumber = numbersList.get(numbersList.size() -2);

        if (firstNumber != secondNumber) {
            return firstNumber;
        }

        if (lastNumber != secondToLastNumber) {
            return lastNumber;
        }

        throw new IllegalArgumentException("No unique number found!");
    }

}
