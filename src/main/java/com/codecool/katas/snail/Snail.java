package com.codecool.katas.snail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Snail {

    // Source: https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

    private int[][] numbers;
    private int counter;
    private int length;

    public int[] sort(int[][] array) {
        List<Integer> sortedNumbers = new ArrayList<>();
        this.numbers = array;
        this.length = array[0].length;

        if (length == 0) {
            return new int[length];
        }

        counter = 0;
        while (counter <  array.length / 2) {
            sortedNumbers.addAll(traverseRight());
            sortedNumbers.addAll(traverseDown());
            sortedNumbers.addAll(traverseLeft());
            sortedNumbers.addAll(traverseUp());
            counter++;
        }

        if (length % 2 == 1) {
            sortedNumbers.add(this.numbers[length / 2][length / 2]);
        }

        return sortedNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

    private List<Integer> traverseRight() {
        int[] traversedNumbers = Arrays.copyOf(numbers[counter], length);
        return Arrays.stream(traversedNumbers)
                .boxed()
                .toList()
                .subList(counter, length - counter);
    }

    private List<Integer> traverseDown() {
        return Arrays.stream(numbers)
                .map(array -> array[length - 1 - counter])
                .toList()
                .subList(counter + 1, length - counter);
    }

    private List<Integer> traverseLeft() {
        int[] traversedNumbers = Arrays.copyOf(numbers[length - 1 - counter], length);
        return Arrays.stream(traversedNumbers)
                .boxed()
                .collect(toReversedList())
                .subList(counter + 1, length - counter);
    }

    private List<Integer> traverseUp() {
        return Arrays.stream(numbers)
                .map(array -> array[counter])
                .collect(toReversedList())
                .subList(counter + 1, length - 1 - counter);
    }

    private <T> Collector<T, ?, List<T>> toReversedList() {
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list;
        });
    }

}
