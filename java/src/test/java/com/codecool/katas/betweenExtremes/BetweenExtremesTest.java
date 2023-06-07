package com.codecool.katas.betweenExtremes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BetweenExtremesTest {

    private final BetweenExtremes betweenExtremes = new BetweenExtremes();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(0, new int[] {0, 0}),
                arguments(1, new int[] {0, 1}),
                arguments(1, new int[] {1, 0}),
                arguments(0, new int[] {1, 1}),
                arguments(1, new int[] {0, -1}),
                arguments(1, new int[] {-1, 0}),
                arguments(0, new int[] {-1, -1}),
                arguments(2, new int[] {1, -1}),
                arguments(2, new int[] {-1, 1}),
                // from CodeWars (fixed and random tests):
                arguments(42, new int[] {21, 34, 54, 43, 26, 12}),
                arguments(99, new int[] {-1, -41, -77, -100}),
                arguments(20, new int[] {23, 3, 19, 21, 16}),
                arguments(961, new int[] {-281, -276, 45, -307, 429, 462, 277, -204, -123, 25, 365, 69, -64, 366, 197, -296, 417, -362, -383, 243, -353, 174, -221, 238, 312, 143, 8, 257, 294, 465, 458, -327, -96, -441, 26, -487, -496, -154, -17, -43, -180, 192, 367, -454, 195, -371, -295, 209, 438, 289, 165, -261, -263, 104, 73, 159, -395, 197, -344, -282, -333, -230, 209, 231, -161, -150, -334, -34, -490, -190, -434, 295, -363, -353, -302, 272, 319, 25, -464, -459, -365, -308, -202, 221, -480, -225, -193, 410, -114, 189, 131, -146, 107, -103, -291, -424, -82, 287, -439}),
                arguments(939, new int[] {331, 36, -304, -135, -493, -421, -498, -199, 441, -407, 372, 317, -282, 338, -351, -60, -425, 374, 294, 376, 356, 200}),
                arguments(840, new int[] {-298, -98, -195, 122, 458, 438, -279, -301, -382, -74}),
                arguments(554, new int[] {1, 434, 555, 34, 112}),
                arguments(237, new int[] {77, -127, 110})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void getMaxDifferenceTest(int result, int[] numbers) {
        assertEquals(result, betweenExtremes.getMaxDifference(numbers));
    }

}
