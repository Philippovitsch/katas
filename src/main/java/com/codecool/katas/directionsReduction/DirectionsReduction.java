package com.codecool.katas.directionsReduction;

import java.util.Arrays;

public class DirectionsReduction {

    // Source: https://www.codewars.com/kata/550f22f4d758534c1100025a

    public String[] reduce(String[] directions) {
        String[] result = directions.clone();

        while (!Arrays.equals(result, deleteUnnecessaryMovements(result))) {
            result = deleteUnnecessaryMovements(result);
        }

        return result;
    }

    private String[] deleteUnnecessaryMovements(String[] directions) {
        for (int i = 0; i < directions.length - 1; i++) {
            if (directions[i].equals("NORTH") && directions[i + 1].equals("SOUTH")) {
                directions[i] = "";
                directions[i + 1] = "";
            }
            else if (directions[i].equals("SOUTH") && directions[i + 1].equals("NORTH")) {
                directions[i] = "";
                directions[i + 1] = "";
            }
            else if (directions[i].equals("EAST") && directions[i + 1].equals("WEST")) {
                directions[i] = "";
                directions[i + 1] = "";
            }
            else if (directions[i].equals("WEST") && directions[i + 1].equals("EAST")) {
                directions[i] = "";
                directions[i + 1] = "";
            }
        }

        return Arrays.stream(directions)
                .filter(direction -> !direction.equals(""))
                .toArray(String[]::new);
    }

}
