package com.codecool.parseIntReloaded;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseIntReloadedTest {

    ParseIntReloaded parseInt = new ParseIntReloaded();

    @ParameterizedTest
    @CsvSource({
            "zero, 0",
            "one, 1",
            "nine, 9",
            "ten, 10",
            "eleven, 11",
            "nineteen, 19",
            "twenty, 20",
            "twenty-one, 21",
            "forty, 40",
            "fifty-eight, 58",
            "ninety-nine, 99",
            "one hundred, 100",
            "one hundred one, 101",
            "two hundred forty-six, 246",
            "nine hundred ninety-nine, 999",
            "one thousand, 1000",
            "three thousand seventy-three, 3073",
            "five thousand two hundred and twenty-five, 5225",
            "ten thousand two hundred and twenty-four, 10224",
            "eighty-one thousand and seventy-two, 81072",
            "eighty-one thousand two hundred and seventy-two, 81272",
            "seven hundred eighty-three thousand nine hundred and nineteen, 783919",
            "nine hundred ninety-nine thousand nine hundred ninety-nine, 999999",
            "one million, 1000000"
    })
    public void parseIntReloadedTest(String numberWord, int numberDigit) {
        assertEquals(numberDigit, parseInt.parseToInt(numberWord));
    }

}
