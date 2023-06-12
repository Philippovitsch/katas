package com.codecool.katas.peteTheBaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PeteTheBaker {

    // Source: https://www.codewars.com/kata/525c65e51bf619685c000059

    public int bake(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> maxCakesPerIngredient = new ArrayList<>();
        for (Map.Entry<String, Integer> ingredient : recipe.entrySet()) {
            if (!available.containsKey(ingredient.getKey())) {
                return 0;
            }
            maxCakesPerIngredient.add(
                    Math.floorDiv(available.get(ingredient.getKey()), recipe.get(ingredient.getKey()))
            );
        }
        return Collections.min(maxCakesPerIngredient);
    }

}
