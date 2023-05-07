package com.codecool.millipedeOfWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MillipedeOfWords {

    // Source: https://www.codewars.com/kata/6344701cd748a12b99c0dbc4

    public boolean isMillipede(String[] millipede) {
        List<String> unsortedMillipede = new ArrayList<>(List.of(millipede));
        List<String> sortedMillipede = new ArrayList<>(List.of(unsortedMillipede.get(0)));
        unsortedMillipede.set(0, null);

        String tempMillipede;

        do {
            tempMillipede = String.join("", sortedMillipede);

            for (int i = 0; i < unsortedMillipede.size(); i++) {
                if (unsortedMillipede.get(i) == null) {
                    continue;
                }

                char firstSortedCharacter = String.join("", sortedMillipede).charAt(0);
                char lastSortedCharacter = String.join("", sortedMillipede).charAt(String.join("", sortedMillipede).length() - 1);
                char firstUnsortedCharacter = unsortedMillipede.get(i).charAt(0);
                char lastUnsortedCharacter = unsortedMillipede.get(i).charAt(unsortedMillipede.get(i).length() - 1);

                if (lastSortedCharacter == firstUnsortedCharacter) {
                    sortedMillipede.add(unsortedMillipede.get(i));
                    unsortedMillipede.set(i, null);
                    continue;
                }
                if (firstSortedCharacter == lastUnsortedCharacter) {
                    sortedMillipede.add(0, unsortedMillipede.get(i));
                    unsortedMillipede.set(i, null);
                }
            }
        } while (!String.join("", sortedMillipede).equals(tempMillipede));

        return unsortedMillipede.stream().allMatch(Objects::isNull);
    }

}
