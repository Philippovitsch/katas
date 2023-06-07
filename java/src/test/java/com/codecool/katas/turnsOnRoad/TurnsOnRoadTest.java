package com.codecool.katas.turnsOnRoad;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnsOnRoadTest {

    TurnsOnRoad turnsOnRoad = new TurnsOnRoad();

    @ParameterizedTest
    @CsvSource({
            "0,  0,  0",
            "0,  1,  0",
            "2,  0,  1",
            "3, -1,  0",
            "4,  0, -1",
            "1,  1,  1",
            "2, -1,  1",
            "3, -1, -1",
            "4,  2, -1",

            // from Codewars:
            "5,  2,  2",
            "5,  2,  1",
            "5,  2,  0",
            "4,  2, -1",
            "8,  2, -2",

            "6, -2,  2",
            "7, -2,  1",
            "7, -2,  0",
            "7, -2, -1",
            "7, -2, -2",

            "5,  2,  2",
            "6,  1,  2",
            "6,  0,  2",
            "6, -1,  2",
            "6, -2,  2",

            "8,  2, -2",
            "8,  1, -2",
            "8,  0, -2",
            "8, -1, -2",
            "7, -2, -2",

            "37, 10, 10",
            "18, 3, 5",
            "2814518, 694481, 703630",
            "3700798, 875286, 925200",
            "3999997, 1000000, 1000000",
    })
    public void calculateNumberOfTurnsTest(int numberOfTurns, int x, int y) {
        assertEquals(numberOfTurns, turnsOnRoad.calculateNumberOfTurns(x, y));
    }

}
