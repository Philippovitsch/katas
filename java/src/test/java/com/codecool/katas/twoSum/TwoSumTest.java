package com.codecool.katas.twoSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(new int[]{1,2,3}, 4),
                arguments(new int[]{2,2,3}, 4),
                arguments(new int[]{2,3,1}, 4),
                arguments(new int[]{1234,5678,9012}, 14690)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void calculateTest(int[] numbers, int target) {
        int[] result = twoSum.calculate(numbers, target);
        assertNotNull(result);
        assertNotEquals(result[0], result[1]);
        assertEquals(2, result.length);

        int num1 = numbers[result[0]];
        int num2 = numbers[result[1]];
        assertEquals(target, num1 + num2);
    }

}
