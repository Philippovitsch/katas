package com.codecool.katas.decodeTheMorseCode2;

import java.util.Map;

import static java.util.Map.entry;

public class MorseCode {

    private static final Map<String, String> morseCodes = Map.<String, String>ofEntries(
            entry(" ", " "),
            entry("-.-.--", "!"),
            entry(".-..-.", "\""),
            entry("...-..-", "$"),
            entry(".-...", "&"),
            entry(".----.", "'"),
            entry("-.--.", "("),
            entry("-.--.-", ")"),
            entry(".-.-.", "+"),
            entry("--..--", ","),
            entry("-....-", "-"),
            entry(".-.-.-", "."),
            entry("-..-.", "/"),
            entry("-----", "0"),
            entry(".----", "1"),
            entry("..---", "2"),
            entry("...--", "3"),
            entry("....-", "4"),
            entry(".....", "5"),
            entry("-....", "6"),
            entry("--...", "7"),
            entry("---..", "8"),
            entry("----.", "9"),
            entry("---...", ":"),
            entry("-.-.-.", ";"),
            entry("-...-", "="),
            entry("..--..", "?"),
            entry(".--.-.", "@"),
            entry(".-", "A"),
            entry("-...", "B"),
            entry("-.-.", "C"),
            entry("-..", "D"),
            entry(".", "E"),
            entry("..-.", "F"),
            entry("--.", "G"),
            entry("....", "H"),
            entry("..", "I"),
            entry(".---", "J"),
            entry("-.-", "K"),
            entry(".-..", "L"),
            entry("--", "M"),
            entry("-.", "N"),
            entry("---", "O"),
            entry(".--.", "P"),
            entry("--.-", "Q"),
            entry(".-.", "R"),
            entry("...", "S"),
            entry("-", "T"),
            entry("..-", "U"),
            entry("...-", "V"),
            entry(".--", "W"),
            entry("-..-", "X"),
            entry("-.--", "Y"),
            entry("--..", "Z"),
            entry("..--.-", "_"),
            entry("...---...", "SOS")
    );

    public static String get(String morseCode) {
        return morseCodes.get(morseCode);
    }

}
