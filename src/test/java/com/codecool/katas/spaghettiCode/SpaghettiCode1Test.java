package com.codecool.katas.spaghettiCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpaghettiCode1Test {

    SpaghettiCode1 spaghetti = new SpaghettiCode1();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments("B", new String[][] {
                        "AAAAAAAA____".split(""),
                        "____________".split(""),
                        "BBBBBBBBBBB_".split(""),
                        "____________".split(""),
                        "CCCCCC______".split("")
                }),
                arguments("C", new String[][] {
                        "AAAAAAAAA      ".split(""),
                        "________A__CCC_".split(""),
                        " B   C  A    C ".split(""),
                        "_B___C__A____C_".split(""),
                        " B   C       C ".split(""),
                        "_B___CCCCCCCCC_".split("")
                }),
                arguments("", new String[][] {
                        "____________".split(""),
                        "____________".split(""),
                        "____________".split(""),
                        "____________".split(""),
                        "____________".split(""),
                        "____________".split("")
                })
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void getLongestPieceTest(String result, String[][] plate) {
        assertEquals(result, spaghetti.getLongestPiece(plate));
    }

}
