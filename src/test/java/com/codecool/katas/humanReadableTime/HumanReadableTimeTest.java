package com.codecool.katas.humanReadableTime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanReadableTimeTest {

    HumanReadableTime time = new HumanReadableTime();

    @ParameterizedTest
    @CsvSource({
            "00:00:00, 0",
            "00:00:01, 1",
            "00:00:05, 5",
            "00:01:00, 60",
            "23:59:59, 86399",
            "99:59:58, 359998",
            "99:59:59, 359999"
    })
    public void makeReadableTest(String result, int seconds) {
        assertEquals(result, time.makeReadable(seconds));
    }

}
