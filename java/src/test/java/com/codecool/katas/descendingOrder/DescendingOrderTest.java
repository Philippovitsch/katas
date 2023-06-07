package com.codecool.katas.descendingOrder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

public class DescendingOrderTest {

    DescendingOrder descendingOrder = new DescendingOrder();

    private static Stream<Arguments> getNumbers() {
        return Stream.of(
                arguments(0, 0),
                arguments(1, 1),
                arguments(42145, 54421),
                arguments(145263, 654321),
                arguments(123456789, 987654321)
        );
    }

    @ParameterizedTest
    @MethodSource("getNumbers")
    public void testKata_rearrangeDigits(int number, int rearrangedNumber) {
        assertEquals(rearrangedNumber, descendingOrder.rearrangeDigits(number));
    }

    // TODO: use @CsvSource()

}
