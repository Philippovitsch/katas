package com.codecool.katas.sumOfASequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfASequenceTest {

    private final SumOfASequence sequence = new SumOfASequence();

    @ParameterizedTest
    @CsvSource({
            " 0,  0,  0,  0",
            " 0,  0,  1,  0",
            " 0,  1,  0,  0",
            " 0,  0,  0,  1",
            " 1,  0,  1,  1",
            " 0,  1,  0,  1",
            " 1,  1,  1,  1",

            "12,  2,  6,  2",
            "15,  1,  5,  1",
            " 5,  1,  5,  3",
            "45,  0, 15,  3",
            " 0, 16, 15,  3",
            "26,  2, 24, 22",
            " 2,  2,  2,  1",
            "35,  1, 15,  3",
            " 0, 15,  1,  3",
    })
    public void sumSequenceTest(int result, int begin, int end, int step) {
        assertEquals(result, sequence.sumSequence_V1(begin, end, step));
        assertEquals(result, sequence.sumSequence_V2(begin, end, step));
    }

}

