package com.codecool.katas.ticTacToeChecker;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TicTacToeChecker {

    // Source: https://www.codewars.com/kata/525caa5c1bf619d28c000335

    public int isSolved(int[][] board) {
        if (hasWon(1, board)) {
            return 1;
        }
        if (hasWon(2, board)) {
            return 2;
        }
        if (isFinished(board)) {
            return 0;
        }

        return -1;
    }

    private boolean isFinished(int[][] board) {
        return Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .noneMatch(position -> position == 0);
    }

    private boolean hasWon(int player, int[][] board) {
        boolean isHorizontalWin = Arrays.stream(board)
                .map(line -> Arrays.stream(line).boxed().toList())
                .anyMatch(line -> Collections.frequency(line, player) == line.size());
        boolean isVerticalWin = IntStream.range(0, board.length)
                .mapToObj(i -> Arrays.stream(board).map(line -> line[i]).collect(Collectors.toList()))
                .anyMatch(line -> Collections.frequency(line, player) == line.size());
        boolean isDiagonal1Win = IntStream.range(0, board.length)
                .map(i -> board[i][i])
                .allMatch(position -> position == player);
        boolean isDiagonal2Win = IntStream.range(0, board.length)
                .map(i -> board[i][board.length - 1 - i])
                .allMatch(position -> position == player);

        return isHorizontalWin || isVerticalWin || isDiagonal1Win || isDiagonal2Win;
    }

}
