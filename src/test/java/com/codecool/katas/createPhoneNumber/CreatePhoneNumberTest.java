package com.codecool.katas.createPhoneNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CreatePhoneNumberTest {

    CreatePhoneNumber phoneNumber = new CreatePhoneNumber();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments("(123) 456-7890", new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}),
                arguments("(111) 111-1111", new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}),
                arguments("(478) 157-9971", new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}),
                arguments("(780) 221-7513", new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void convertTest(String result, int[] numbers) {
        assertEquals(result, phoneNumber.convert(numbers));
    }

}
