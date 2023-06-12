package com.codecool.katas.peteTheBaker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PeteTheBakerTest {

    private final PeteTheBaker pete = new PeteTheBaker();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(
                        1,
                        Map.of("cream", 1, "flour", 3, "sugar", 1, "milk", 1, "oil", 1, "eggs", 1),
                        Map.of("cream", 1, "flour", 3, "sugar", 1, "milk", 1, "oil", 1, "eggs", 1)
                ),
                arguments(
                        2,
                        Map.of("flour", 500, "sugar", 200, "eggs", 1),
                        Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200)
                ),
                arguments(
                        11,
                        Map.of("cream", 200, "flour", 300, "sugar", 150, "milk", 100, "oil", 100),
                        Map.of("sugar", 1700, "flour", 20000, "milk", 20000, "oil", 30000, "cream", 5000)
                ),
                arguments(
                        0,
                        Map.of("apples", 3, "flour", 300, "sugar", 150, "milk", 100, "oil", 100),
                        Map.of("sugar", 500, "flour", 2000, "milk", 2000)
                ),
                arguments(
                        0,
                        Map.of("apples", 3, "flour", 300, "sugar", 150, "milk", 100, "oil", 100),
                        Map.of("sugar", 500, "flour", 2000, "milk", 2000, "apples", 15, "oil", 20)
                ),
                arguments(
                        0,
                        Map.of("eggs", 4, "flour", 400),
                        Map.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void bakeTest(int result, Map<String, Integer> recipe, Map<String, Integer> available) {
        assertEquals(result, pete.bake(recipe, available));
    }

}
