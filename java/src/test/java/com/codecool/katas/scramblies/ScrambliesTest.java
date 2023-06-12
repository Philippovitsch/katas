package com.codecool.katas.scramblies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrambliesTest {

    private final Scramblies scrambler = new Scramblies();

    @ParameterizedTest
    @CsvSource({
            "true, '', ''",
            "true, a, a",
            "true, ab, a",
            "true, ab, ab",
            "true, ab, ba",
            "true, abc, a",
            "true, abc, ab",
            "true, abc, abc",
            "true, abc, ac",
            "true, abc, bc",
            "true, aabc, ab",
            "false, a, c",
            "false, ab, ac",
            "false, abc, acd",
            "false, abc, aabc",

            // Codewars test cases
            "true, rkqodlw, world",
            "true, cedewaraaossoqqyt, codewars",
            "false, katas, steak",
            "false, scriptjavx, javascript",
            "true, scriptingjava, javascript",
            "true, scriptsjava, javascripts",
            "false, javscripts, javascript",
            "true, aabbcamaomsccdd, commas",
            "true,commas, commas",
            "true, sammoc, commas",
    })
    public void scrambleTest(boolean result, String firstWord, String secondWord) {
        assertEquals(result, scrambler.scramble(firstWord, secondWord));
    }

}
