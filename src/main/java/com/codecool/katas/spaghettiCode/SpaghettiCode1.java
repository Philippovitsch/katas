package com.codecool.katas.spaghettiCode;

import java.util.Arrays;

public class SpaghettiCode1 {

    // Source: https://www.codewars.com/kata/57d7805cec167081a50014ac

    private final int letterA = 65;
    private final int letterZ = 90;

    public String getLongestPiece(String[][] spaghettiPlate) {
        String longestSpaghetti = "";
        long numberOfLongestPieces = 0;

        for(int character = letterA; character <= letterZ; character++) {
            long spaghettiCounter = 0;
            for(String[] spaghettiRow : spaghettiPlate) {
                spaghettiCounter += countSpaghettiPieces(spaghettiRow, character);
            }
            if (spaghettiCounter > numberOfLongestPieces) {
                longestSpaghetti = String.valueOf((char) character);
                numberOfLongestPieces = spaghettiCounter;
            }
        }

        return longestSpaghetti;
    }

    private long countSpaghettiPieces(String[] spaghettiRow, int character) {
        return Arrays.stream(spaghettiRow)
                .filter(spaghettiPiece -> spaghettiPiece.charAt(0) == character)
                .count();
    }

}
