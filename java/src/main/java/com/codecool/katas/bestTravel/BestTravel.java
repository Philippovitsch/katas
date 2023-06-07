package com.codecool.katas.bestTravel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BestTravel {

    // Source: https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa

    private List<List<Integer>> combinations;
    private int[] tempCombination;

    public Integer chooseBestRoute(int maxDistance, int maxTowns, List<Integer> distances) {
        combinations = new ArrayList<>();
        tempCombination = new int[maxTowns];

        getPossibleCombinations(distances, maxTowns, 0, distances.size() - 1, 0);

        return combinations.stream()
                .map(combination -> combination.stream().mapToInt(Integer::intValue).sum())
                .filter(distance -> distance <= maxDistance)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

    private void getPossibleCombinations(List<Integer> distances, int maxTowns, int start, int end, int index) {
        if (index == maxTowns) {
            List<Integer> newCombination = new ArrayList<>();
            for (int j = 0; j < maxTowns; j++) {
                newCombination.add(tempCombination[j]);
            }
            combinations.add(newCombination);
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= maxTowns - index; i++) {
            tempCombination[index] = distances.get(i);
            getPossibleCombinations(distances, maxTowns, i + 1, end, index + 1);
        }
    }

}
