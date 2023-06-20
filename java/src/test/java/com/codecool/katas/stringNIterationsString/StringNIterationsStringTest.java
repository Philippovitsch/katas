package com.codecool.katas.stringNIterationsString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringNIterationsStringTest {

    private final StringNIterationsString encoder = new StringNIterationsString();

    @ParameterizedTest
    @CsvSource({
            "I'm Philipp, I'm Philipp, 0",
            "ImPiip' hlp, I'm Philipp, 1",
            "IPi'hpmip l, I'm Philipp, 2",
            "I'm Philipp, I'm Philipp, 10",
            "ImPiip' hlp, I'm Philipp, 11",
            "IPi'hpmip l, I'm Philipp, 12",
            // Tests from Codewars:
            "Iiei t kl!, I like it!, 1234",
            "criyinodedsgufrnodnoser, codingisfornerdsyounerd, 10101010",
            "ti_etwl_utyuhsts_ilhr_o, this_test_will_hurt_you, 12345678987654321"

    })
    public void encodeTest(String result, String text, long iterations) {
        assertEquals(result, encoder.encode(text, iterations));
    }

}
