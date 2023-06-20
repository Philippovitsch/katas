package com.codecool.katas.reverseOrRotate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseOrRotateTest {

    private final ReverseOrRotate reverseOrRotate = new ReverseOrRotate();

    @ParameterizedTest
    @CsvSource({
            "'', '', -1",
            "'', '', 0",
            "'', '', 4",
            "'', 123456, -1",
            "'', 123456, 0",
            "'', 123456, 10",
            "44668753, 66443875, 4",
            "64438756, 66443875, 8",
            "67834466, 664438769, 8",
            "23456771, 123456779, 8",
            "234561876549, 123456987654, 6",
            "234561356789, 123456987653, 6",
            "0365065073456944, 563000655734469485, 4",
            "1994033775182780067155464327690480265895, 73304991087281576455176044327690580265896, 8",
            "1994033775182780067155464327690480265895, 73304991087281576455176044327690580265896896028, 8",
            "1827801994033776455176044325690580265896875622816218206939441215340984, 73304991087281576455176044327690580265896896028126182265439441215340989, 14"
    })
    public void shuffleTest(String result, String numbers, int chunkSize) {
        assertEquals(result, reverseOrRotate.shuffle(numbers, chunkSize));
    }

}
