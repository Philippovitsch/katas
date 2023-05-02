package com.codecool.findTheUniqueNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheUniqueNumberTest {

    private final FindTheUniqueNumber finder = new FindTheUniqueNumber();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(1, new double[] {0, 0, 0, 0, 1}),
                arguments(2, new double[] {2, 0, 0, 0, 0}),
                arguments(3, new double[] {0, 0, 3, 0, 0}),
                arguments(0.55, new double[] { 0, 0, 0.55, 0, 0 }),
                arguments(1.0, new double[] {0.0, 1.0, 0.0}),
                arguments(3.0, new double[] {4.0, 4.0, 4.0, 3.0, 4.0, 4.0, 4.0, 4.0}),
                arguments(1.099511627776E12, new double[] {1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.099511627776E12, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15, 1.125899906842624E15})
        );
    }

    private static Stream<Arguments> getExceptions() {
        return Stream.of(
                arguments(IllegalArgumentException.class, new double[] {}),
                arguments(IllegalArgumentException.class, new double[] {1}),
                arguments(IllegalArgumentException.class, new double[] {2, 0}),
                arguments(IllegalArgumentException.class, new double[] {0, 0, 0, 0, 0}),
                arguments(IllegalArgumentException.class, new double[] {1.0, 1.0, 1.0, 1.0, 1.0})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void findUniqueNumberTest(double result, double[] numbers) {
        assertEquals(result, finder.findUniqueNumber(numbers));
        assertEquals(result, finder.findUniqueNumber_old(numbers));
    }

    @ParameterizedTest
    @MethodSource("getExceptions")
    public void findUniqueNumberTestExceptions(Class<Exception> exception, double[] numbers) {
        assertThrows(exception, () -> finder.findUniqueNumber(numbers));
        assertThrows(exception, () -> finder.findUniqueNumber_old(numbers));
    }

}
