package com.codecool.katas.soManyPermutations;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SoManyPermutationsTest {

    private final SoManyPermutations permutor = new SoManyPermutations();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(List.of(""), ""),
                arguments(List.of("a"), "a"),
                arguments(List.of("ab", "ba"), "ab"),
                arguments(List.of("abc", "acb", "bac", "bca", "cab", "cba"), "abc"),
                arguments(List.of("aabb", "abab", "abba", "baab", "baba", "bbaa"), "aabb"),
                arguments(
                        List.of("abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca",
                                "cabd", "cadb", "cbad", "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba"),
                        "abcd"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void permute(List<String> result, String word) {
        assertTrue(CollectionUtils.isEqualCollection(result, permutor.permute(word)));
    }

}
