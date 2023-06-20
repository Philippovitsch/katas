package com.codecool.katas.stringNIterationsString;

public class StringNIterationsString {

    // Source: https://www.codewars.com/kata/5ae43ed6252e666a6b0000a4

    public String encode(String text, long iterations) {
        long maxDifferentIterations = getMaxDifferentIterations(text);
        long numberOfIterations = iterations - Math.floorDiv(iterations, maxDifferentIterations) * maxDifferentIterations;
        String encodedText = text;
        for (long i = 0; i < numberOfIterations; i++) {
            encodedText = shuffleLetters(encodedText);
        }
        return encodedText;
    }

    private long getMaxDifferentIterations(String text) {
        String encodedText = shuffleLetters(text);
        long counter = 1;
        while (!encodedText.equals(text)) {
            encodedText = shuffleLetters(encodedText);
            counter++;
        }
        return counter;
    }

    private String shuffleLetters(String text) {
        String encodedText = text;
        StringBuilder evenLetters = new StringBuilder();
        StringBuilder oddLetters = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            if (i % 2 == 0) {
                evenLetters.append(encodedText.charAt(i));
            } else {
                oddLetters.append(encodedText.charAt(i));
            }
        }
        encodedText = evenLetters + oddLetters.toString();
        return encodedText;
    }

}
