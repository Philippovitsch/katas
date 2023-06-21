package com.codecool.katas.simpleAssemblerInterpreter;

import java.util.HashMap;
import java.util.Map;

public class SimpleAssemblerInterpreter {

    // Source: https://www.codewars.com/kata/58e24788e24ddee28e000053

    private final int COMMAND = 0;
    private final int REGISTER = 1;
    private final int VALUE = 2;

    public Map<String, Integer> interpret(String[] instructions) {
        Map<String, Integer> out = new HashMap<>();
        for (int i = 0; i < instructions.length; i++) {
            String[] splitInstruction = instructions[i].split(" ");
            switch (splitInstruction[COMMAND]) {
                case "mov" -> {
                    int value = (isNumeric(splitInstruction[VALUE]))
                            ? Integer.parseInt(splitInstruction[VALUE])
                            : out.get(splitInstruction[VALUE]);
                    out.put(splitInstruction[REGISTER], value);
                }
                case "inc" -> {
                    int value = out.get(splitInstruction[REGISTER]) + 1;
                    out.put(splitInstruction[REGISTER], value);
                }
                case "dec" -> {
                    int value = out.get(splitInstruction[REGISTER]) - 1;
                    out.put(splitInstruction[REGISTER], value);
                }
                case "jnz" -> {
                    int value = Integer.parseInt(splitInstruction[VALUE]);
                    if (!isNumeric(splitInstruction[REGISTER]) && out.get(splitInstruction[REGISTER]) != 0) {
                        i += (value - 1);
                    }
                    if (isNumeric(splitInstruction[REGISTER]) && Integer.parseInt(splitInstruction[REGISTER]) > 0) {
                        i += (value - 1);
                    }
                }
            }
        }
        return out;
    }

    private boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException ignored) {
            return false;
        }
    }

}
