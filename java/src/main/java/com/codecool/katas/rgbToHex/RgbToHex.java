package com.codecool.katas.rgbToHex;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RgbToHex {

    // Source: https://www.codewars.com/kata/513e08acc600c94f01000001

    // First variant
    public String convert1(int r, int g, int b) {
        return getHex(r) + getHex(g) + getHex(b);
    }

    private String getHex(int colorValue) {
        if (colorValue < 0) {
            colorValue = 0;
        }
        if (colorValue > 255) {
            colorValue = 255;
        }

        return String.format("%02X", colorValue);
    }

    // Second variant with stream
    public String convert2(int r, int g, int b) {
        return Stream.of(r, g, b)
                .map(value -> value < 0 ? 0 : value)
                .map(value -> value > 255 ? 255 : value)
                .map(value -> String.format("%02X", value))
                .collect(Collectors.joining());
    }

}
