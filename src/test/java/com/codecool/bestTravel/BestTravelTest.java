package com.codecool.bestTravel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestTravelTest {

    BestTravel bestTravel = new BestTravel();

    private static Stream<Arguments> getTestCases() {
        List<Integer> distancesTiny = List.of(50);
        List<Integer> distancesSmall = List.of(50, 56, 57, 58);
        List<Integer> distancesMedium = List.of(91, 74, 73, 85, 73, 81, 87);
        List<Integer> distancesLarge = List.of(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89);

        return Stream.of(
                arguments(null, 163, 3, distancesTiny),
                arguments(163,  163, 3, distancesSmall),
                arguments(228,  230, 3, distancesMedium),
                arguments(230,  230, 4, distancesLarge)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void chooseBestRouteTest(Integer result, int maxDistance, int maxTowns, List<Integer> distances) {
        assertEquals(result, bestTravel.chooseBestRoute(maxDistance, maxTowns, distances));
    }

}
