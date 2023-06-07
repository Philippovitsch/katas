package com.codecool.katas.isograms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsogramsTest {

    Isograms isograms = new Isograms();

    @ParameterizedTest
    @CsvSource({
            "true, ''",
            "true, i",
            "true, is",
            "true, Is",
            "true, iS",
            "true, IS",
            "false, ii",
            "false, Ii",
            "false, iI",
            "false, II",
            "true, isogram",
            "true, Dermatoglyphics",
            "true, thumbscrewjapingly",
            "true, abcdefghijklmnopqrstuvwxyz",
            "true, ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "false, aba",
            "false, moose",
            "false, moOse",
            "false, isIsogram"
    })
    public void isIsogramTest(boolean result, String word) {
        assertEquals(result, isograms.isIsogram_V1(word));
        assertEquals(result, isograms.isIsogram_V2(word));
    }

}
