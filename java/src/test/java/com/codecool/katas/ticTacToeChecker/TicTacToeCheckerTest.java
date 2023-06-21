package com.codecool.katas.ticTacToeChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TicTacToeCheckerTest {

    private final TicTacToeChecker ticTacToe = new TicTacToeChecker();

    private static Stream<Arguments> getTestCases_notFinished() {
        return Stream.of(
                arguments(-1, new int[][] {{0, 0, 1}, {0, 1, 2}, {2, 1, 0}}),
                arguments(-1, new int[][] {{2, 0, 2}, {2, 1, 1}, {1, 2, 1}}),
                arguments(-1, new int[][] {{0, 0, 2}, {0, 0, 0}, {1, 2, 1}}),
                arguments(-1, new int[][] {{1, 2, 1}, {1, 1, 2}, {2, 2, 0}}),
                arguments(-1, new int[][] {{0, 2, 2}, {2, 1, 1}, {0, 0, 1}}),
                arguments(-1, new int[][] {{0, 1, 1}, {2, 0, 2}, {2, 1, 0}})
        );
    }

    private static Stream<Arguments> getTestCases_winnerX() {
        return Stream.of(
                arguments(1, new int[][] {{1, 1, 1}, {0, 2, 2}, {0, 0, 0}}),
                arguments(1, new int[][] {{1, 2, 1}, {1, 0, 2}, {1, 2, 0}}),
                arguments(1, new int[][] {{1, 0, 2}, {0, 1, 2}, {0, 0, 1}}),
                arguments(1, new int[][] {{0, 0, 1}, {0, 1, 2}, {1, 0, 2}})
        );
    }

    private static Stream<Arguments> getTestCases_winnerO() {
        return Stream.of(
                arguments(2, new int[][] {{1, 0, 1}, {1, 2, 0}, {2, 2, 2}}),
                arguments(2, new int[][] {{1, 2, 1}, {1, 2, 2}, {0, 2, 0}}),
                arguments(2, new int[][] {{2, 1, 0}, {0, 2, 0}, {0, 1, 2}}),
                arguments(2, new int[][] {{1, 1, 2}, {0, 2, 0}, {2, 1, 1}})
        );
    }

    private static Stream<Arguments> getTestCases_draw() {
        return Stream.of(
                arguments(0, new int[][] {{1, 2, 1}, {1, 1, 2}, {2, 1, 2}}),
                arguments(0, new int[][] {{1, 2, 1}, {2, 2, 1}, {2, 1, 2}}),
                arguments(0, new int[][] {{2, 1, 2}, {2, 1, 1}, {1, 2, 1}}),
                arguments(0, new int[][] {{1, 1, 2}, {2, 2, 1}, {1, 2, 1}})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestCases_notFinished")
    public void isSolvedTest_notFinished(int result, int[][] board) {
        assertEquals(result, ticTacToe.isSolved(board));
    }

    @ParameterizedTest
    @MethodSource("getTestCases_winnerX")
    public void isSolvedTest_winnerX(int result, int[][] board) {
        assertEquals(result, ticTacToe.isSolved(board));
    }

    @ParameterizedTest
    @MethodSource("getTestCases_winnerO")
    public void isSolvedTest_winnerO(int result, int[][] board) {
        assertEquals(result, ticTacToe.isSolved(board));
    }

    @ParameterizedTest
    @MethodSource("getTestCases_draw")
    public void isSolvedTest_draw(int result, int[][] board) {
        assertEquals(result, ticTacToe.isSolved(board));
    }

}
