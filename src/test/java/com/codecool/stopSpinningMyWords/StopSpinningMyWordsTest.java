package com.codecool.stopSpinningMyWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopSpinningMyWordsTest {

    private final int INSTRUCTION = 0;
    private final int RESULT = 1;

    private final StopSpinningMyWords kata = new StopSpinningMyWords();
    private final String[][] testCases = {
            {"Hey fellow warriors", "Hey wollef sroirraw"},
            {"This is a test", "This is a test"},
            {"This is another test", "This is rehtona test"}
    };

    @Test
    public void testReverseWords() {
        for (String[] testCase : testCases) {
            assertEquals(kata.reverseSpecificWords(testCase[INSTRUCTION]), testCase[RESULT]);
        }
    }

}
