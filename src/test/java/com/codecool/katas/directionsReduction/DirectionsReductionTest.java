package com.codecool.katas.directionsReduction;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DirectionsReductionTest {

    DirectionsReduction directionsReduction = new DirectionsReduction();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(
                        new String[]{},
                        new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}
                ),
                arguments(
                        new String[] {"WEST"},
                        new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}
                ),
                arguments(
                        new String[]{"EAST", "NORTH"},
                        new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"}
                ),
                arguments(
                        new String[]{"NORTH", "EAST"},
                        new String[]{"NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"}
                ),
                arguments(
                        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                        new String[]{"NORTH", "WEST", "SOUTH", "EAST"}
                ),
                arguments(
                        new String[]{"WEST", "WEST"},
                        new String[]{"EAST", "WEST", "WEST", "WEST"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void reduceTest(String[] result, String[] directions) {
        assertArrayEquals(result, directionsReduction.reduce(directions));
    }

}
