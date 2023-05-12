package com.codecool.katas.sumStringsAsNumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStringsAsNumbersTest {

    private final SumStringsAsNumbers sumStringsAsNumbers = new SumStringsAsNumbers();

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 1, 2",
            "1, 2, 3",
            "2, 3, 5",
            "123, 456, 579",
            "800, 9567, 10367",
            "3266562656715422764542, 07342336, 3266562656715430106878",
            "60166267611224662, 57118725150322312816760, 57118785316589924041422"
    })
    public void sumStringsAsNumbersTest(String number1, String number2, String result) {
        assertEquals(result, sumStringsAsNumbers.calculateSum(number1, number2));
    }

}
