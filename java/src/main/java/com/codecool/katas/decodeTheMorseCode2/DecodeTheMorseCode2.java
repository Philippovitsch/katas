package com.codecool.katas.decodeTheMorseCode2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DecodeTheMorseCode2 {

    // Source: https://www.codewars.com/kata/54b72c16cd7f5154e9000457

    public String decodeBits(String bits) {
        bits = removeExtraZeroes(bits);
        int timing = getTiming(bits);
        return bits
                .replaceAll("0".repeat(timing).repeat(7), "   ")
                .replaceAll("0".repeat(timing).repeat(3), " ")
                .replaceAll("1".repeat(timing).repeat(3), "-")
                .replaceAll("1".repeat(timing), ".")
                .replaceAll("0", "");
    }

    public String decodeMorse(String morseCode) {
        return Arrays.stream(morseCode.split("   "))
                .map(word -> Arrays.stream(word.split(" "))
                        .map(MorseCode::get)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
    }

    private String removeExtraZeroes(String bits) {
        int beginIndex = 0;
        int endIndex = bits.length() - 1;
        while (bits.charAt(beginIndex) == '0') {
            beginIndex++;
        }
        while (bits.charAt(endIndex) == '0') {
            endIndex--;
        }
        return bits.substring(beginIndex, endIndex + 1);
    }

    private int getTiming(String bits) {
        int timingForOnes = calculateTimingFor('1', bits);
        int timingForZeros = calculateTimingFor('0', bits);
        return Math.min(timingForOnes, timingForZeros);
    }

    private int calculateTimingFor(char character, String bits) {
        int timing = bits.length();
        int counter = 0;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == character) {
                counter++;
            } else if (i > 0 && bits.charAt(i - 1) == character) {
                timing = Math.min(counter, timing);
            } else {
                counter = 0;
            }
        }
        return timing;
    }

}
