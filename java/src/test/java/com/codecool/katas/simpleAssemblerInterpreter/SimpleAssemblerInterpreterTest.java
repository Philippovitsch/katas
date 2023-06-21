package com.codecool.katas.simpleAssemblerInterpreter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SimpleAssemblerInterpreterTest {

    private final SimpleAssemblerInterpreter interpreter = new SimpleAssemblerInterpreter();

    private static Stream<Arguments> getTestCases() {
        return Stream.of(
                arguments(
                        Map.of("a", 1),
                        new String[]{"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"}
                ),
                arguments(
                        Map.of("a", 0, "b", -20),
                        new String[]{"mov a -10","mov b a","inc a","dec b","jnz a -2"}
                ),
                arguments(
                        Map.of("a", 1, "b", 0, "d", 1),
                        new String[]{"mov d 100","dec d","mov b d","jnz b -2","inc d","mov a d","jnz 5 10","mov c a"}
                ),
                arguments(
                        Map.of("a", 409600, "b", 409600, "c", 409600),
                        new String[]{
                                "mov c 12","mov b 0","mov a 200","dec a","inc b", "jnz a -2",
                                "dec c","mov a b","jnz c -5","jnz 0 1","mov c a"
                        }
                ),
                arguments(
                        Map.of("a", 318009, "b", 196418, "c", 0, "d", 0),
                        new String[]{
                                "mov a 1","mov b 1","mov c 0","mov d 26","jnz c 2", "jnz 1 5","mov c 7","inc d",
                                "dec c","jnz c -2","mov c a","inc a","dec b","jnz b -2","mov b c","dec d",
                                "jnz d -6","mov c 18","mov d 11","inc a","dec d","jnz d -2","dec c","jnz c -5"
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases")
    public void interpretTest(Map<String, Integer> result, String[] commands) {
        assertEquals(result, interpreter.interpret(commands));
    }

}
