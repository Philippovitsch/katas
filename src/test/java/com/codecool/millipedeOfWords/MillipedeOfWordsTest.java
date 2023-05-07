package com.codecool.millipedeOfWords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MillipedeOfWordsTest {

    private static final MillipedeOfWords millipedeOfWords = new MillipedeOfWords();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(true, new String[] {"engine", "endure", "elite", "excess"}),
                arguments(true, new String[] {"stereotype", "excess", "stereotype", "empire", "effort"}),
                arguments(true, new String[] {"excavate", "endure", "desire", "screen", "theater", "excess", "night"}),
                arguments(true, new String[] {"east", "e", "e", "t", "t", "e", "time"}),
                arguments(false, new String[] {"trade", "pole", "view", "grave", "ladder", "mushroom", "president"}),
                arguments(false, new String[] {"no", "dog", "on", "good"}),
                arguments(false, new String[] {"endure", "embrace", "transport", "expectation"})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void isMillipedeTest(boolean result, String[] millipede) {
        assertEquals(result, millipedeOfWords.isMillipede(millipede));
    }

}
