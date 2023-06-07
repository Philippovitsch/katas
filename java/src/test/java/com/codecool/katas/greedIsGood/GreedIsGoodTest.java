package com.codecool.katas.greedIsGood;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreedIsGoodTest {

    GreedIsGood greed = new GreedIsGood();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(250, new int[] {5, 1, 3, 4, 1}),
                arguments(1100, new int[] {1, 1, 1, 3, 1}),
                arguments(450, new int[] {2, 4, 4, 5, 4}),
                arguments(550, new int[] {5, 5, 5, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void getScoreTest(int result, int[] diceThrows) {
        assertEquals(result, greed.getScore(diceThrows));
    }

}
