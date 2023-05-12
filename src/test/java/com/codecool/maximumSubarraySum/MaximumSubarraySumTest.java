package com.codecool.maximumSubarraySum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumSubarraySumTest {

    MaximumSubarraySum maximumSubarraySum = new MaximumSubarraySum();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(0, new int[]{}),
                arguments(0, new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}),
                arguments(6, new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}),
                arguments(155, new int[]{7, 4, 11, -11, 39, 36, 10, -6, 37, -10, -32, 44, -26, -34, 43, 43})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void calculateTest(int result, int[] numbers) {
        assertEquals(result, maximumSubarraySum.calculate(numbers));
    }

}
