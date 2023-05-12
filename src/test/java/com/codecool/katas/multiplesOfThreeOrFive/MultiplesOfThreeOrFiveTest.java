package com.codecool.katas.multiplesOfThreeOrFive;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOfThreeOrFiveTest {

    MultiplesOfThreeOrFive multiples = new MultiplesOfThreeOrFive();

    @ParameterizedTest
    @CsvSource({
            "-78,    0",
            " -3,    0",
            " -2,    0",
            " -1,    0",
            "  0,    0",
            "  1,    0",
            "  2,    0",
            "  3,    0",
            "  4,    3",
            "  5,    3",
            "  6,    8",
            "  7,   14",
            "  8,   14",
            "  9,   14",
            " 10,   23",
            " 20,   78",
            " 17,   60",
            "200, 9168"
    })
    public void multiplesOfThreeOrFiveTest(int number, int result) {
        assertEquals(result, multiples.sumMultiples(number));
        assertEquals(result, multiples.sumMultiples_boringSolution(number));

    }

}
