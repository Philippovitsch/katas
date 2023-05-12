package com.codecool.katas.rgbToHex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RgbToHexTest {

    RgbToHex rgbToHex = new RgbToHex();

    @ParameterizedTest
    @CsvSource({
            "000000, 0, 0, 0",
            "010203, 1, 2, 3",
            "FFFFFF, 255, 255, 255",
            "FEFDFC, 254, 253, 252",
            "00FF7D, -20, 275, 125"
    })
    public void sampleTests(String result, int r, int g, int b) {
        assertEquals(result, rgbToHex.convert1(r, g, b));
        assertEquals(result, rgbToHex.convert2(r, g, b));
    }

}
