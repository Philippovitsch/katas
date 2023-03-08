package com.codecool.sortTheOdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTheOddTest {

    private SortTheOdd sortTheOdd;

    @BeforeEach
    public void setup() {
        sortTheOdd = new SortTheOdd();
    }

    @Test
    public void sortTheOdd_TwoEntries() {
        Integer[] numbers = {7, 1};
        Integer[] result = {1, 7};
        assertArrayEquals(sortTheOdd.sort(numbers), result);
    }

    @Test
    public void sortTheOdd_FiveEntries() {
        Integer[] numbers = {5, 8, 6, 3, 4};
        Integer[] result = {3, 8, 6, 5, 4};
        assertArrayEquals(sortTheOdd.sort(numbers), result);
    }

    @Test
    public void sortTheOdd_TenEntries() {
        Integer[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] result = {1, 8, 3, 6, 5, 4, 7, 2, 9, 0};
        assertArrayEquals(sortTheOdd.sort(numbers), result);
    }

}
