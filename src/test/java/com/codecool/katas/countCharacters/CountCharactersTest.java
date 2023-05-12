package com.codecool.katas.countCharacters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountCharactersTest {

    private final CountCharacters countCharacters = new CountCharacters();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(Map.ofEntries(), ""),
                arguments(Map.ofEntries(
                        entry('a', 1)
                ), "a"),
                arguments(Map.ofEntries(
                        entry('a', 3),
                        entry('b', 3),
                        entry('c', 1)
                ), "aabbbac"),
                arguments(Map.ofEntries(
                        entry('a', 1),
                        entry('b', 1),
                        entry('c', 1)
                ), "abc"),
                arguments(Map.ofEntries(
                        entry('a', 5)
                ), "aaaaa"),
                arguments(Map.ofEntries(
                        entry('a', 2),
                        entry('b', 2)
                ), "aabb")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void countTest(Map<Character, Integer> result, String characters) {
        assertEquals(result, countCharacters.count(characters));
    }

}
