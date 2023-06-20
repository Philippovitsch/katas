package com.codecool.katas.decodeTheMorseCode2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTheMorseCode2Test {

    private final DecodeTheMorseCode2 decoder = new DecodeTheMorseCode2();

    @ParameterizedTest
    @CsvSource({
            "E, 1",
            "I, 101",
            "EE, 10001",
            "A, 10111",
            "M, 1110111"
    })
    public void decodeBits_basicTest(String result, String bits) {
        String morseCode = decoder.decodeBits(bits);
        assertEquals(result, decoder.decodeMorse(morseCode));
    }

    @ParameterizedTest
    @CsvSource({
            "E, 111",
            "E, 1111111",
            "I, 110011",
            "I, 111000111",
            "I, 111110000011111",
            "M, 11111100111111",
            "EE, 111000000000111",
            "S, 111000111000111"
    })
    public void decodeBits_multipleBitsPerDotHandling(String result, String bits) {
        String morseCode = decoder.decodeBits(bits);
        assertEquals(result, decoder.decodeMorse(morseCode));
    }

    @ParameterizedTest
    @CsvSource({
            "E, 01110",
            "E, 000000011100000",

    })
    public void decodeBits_extraZerosHandling(String result, String bits) {
        String morseCode = decoder.decodeBits(bits);
        assertEquals(result, decoder.decodeMorse(morseCode));
    }

    @ParameterizedTest
    @CsvSource({
            "HEY JUDE, 1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011",
            "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG., 00011100010101010001000000011101110101110001010111000101000111010111010001110101110000000111010101000101110100011101110111000101110111000111010000000101011101000111011101110001110101011100000001011101110111000101011100011101110001011101110100010101000000011101110111000101010111000100010111010000000111000101010100010000000101110101000101110001110111010100011101011101110000000111010100011101110111000111011101000101110101110101110",
            "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG., 11111111111111100000000000000011111000001111100000111110000011111000000000000000111110000000000000000000000000000000000011111111111111100000111111111111111000001111100000111111111111111000000000000000111110000011111000001111111111111110000000000000001111100000111110000000000000001111111111111110000011111000001111111111111110000011111000000000000000111111111111111000001111100000111111111111111000000000000000000000000000000000001111111111111110000011111000001111100000111110000000000000001111100000111111111111111000001111100000000000000011111111111111100000111111111111111000001111111111111110000000000000001111100000111111111111111000001111111111111110000000000000001111111111111110000011111000000000000000000000000000000000001111100000111110000011111111111111100000111110000000000000001111111111111110000011111111111111100000111111111111111000000000000000111111111111111000001111100000111110000011111111111111100000000000000000000000000000000000111110000011111111111111100000111111111111111000001111111111111110000000000000001111100000111110000011111111111111100000000000000011111111111111100000111111111111111000000000000000111110000011111111111111100000111111111111111000001111100000000000000011111000001111100000111110000000000000000000000000000000000011111111111111100000111111111111111000001111111111111110000000000000001111100000111110000011111000001111111111111110000000000000001111100000000000000011111000001111111111111110000011111000000000000000000000000000000000001111111111111110000000000000001111100000111110000011111000001111100000000000000011111000000000000000000000000000000000001111100000111111111111111000001111100000111110000000000000001111100000111111111111111000000000000000111111111111111000001111111111111110000011111000001111100000000000000011111111111111100000111110000011111111111111100000111111111111111000000000000000000000000000000000001111111111111110000011111000001111100000000000000011111111111111100000111111111111111000001111111111111110000000000000001111111111111110000011111111111111100000111110000000000000001111100000111111111111111000001111100000111111111111111000001111100000111111111111111"
    })
    public void decodeBits_longMessageHandling(String result, String bits) {
        String morseCode = decoder.decodeBits(bits);
        assertEquals(result, decoder.decodeMorse(morseCode));
    }

}
