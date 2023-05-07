package com.codecool.asciiBetizer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AsciiBetizerTest {

    private final AsciiBetizer asciiBetizer = new AsciiBetizer();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(
                        new String[] {"The", "dog", "the", "fox", "over", "lazy", "quick", "brown", "jumped"},
                        "The quick brown fox jumped over the lazy dog"
                ),
                arguments(
                        new String[] {"DOG", "THE", "FOX", "The", "dog", "OVER", "LAZY", "the", "fox", "QUICK", "BROWN", "over", "lazy", "JUMPED", "quick", "brown", "jumped"},
                        "The THE quick QUICK brown BROWN fox FOX jumped JUMPED over OVER the lazy LAZY dog DOG"
                ),
                arguments(
                        new String[] {"A", "a"},
                        "a a a a A A a A a a A A A"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void sortTest(String[] result, String words) {
        assertArrayEquals(result, asciiBetizer.sort(words));
    }

}
