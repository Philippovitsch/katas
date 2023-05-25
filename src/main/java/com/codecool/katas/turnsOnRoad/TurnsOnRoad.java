package com.codecool.katas.turnsOnRoad;

public class TurnsOnRoad {

    // Source: https://www.codewars.com/kata/591c075a94414c1617000063

    private int currentX;
    private int currentY;
    private int currentPace;
    private String currentDirection;

    public int calculateNumberOfTurns(int x, int y) {
        currentX = 0;
        currentY = 0;
        currentPace = 1;
        currentDirection = "East";

        int numberOfTurns = 0;
        while (true) {
            int tempX = currentX;
            int tempY = currentY;
            moveEntity();
            changeDirection();
            if (foundFood(x, y, tempX, tempY)) {
                break;
            }
            numberOfTurns++;
        }

        return numberOfTurns;
    }

    private void moveEntity() {
        switch (currentDirection) {
            case "East" -> currentX += currentPace;
            case "North" -> currentY += currentPace;
            case "West" -> currentX -= currentPace;
            case "South" -> currentY -= currentPace;
        }

        if (currentDirection.equals("North") || currentDirection.equals("South")) {
            currentPace++;
        }
    }

    private void changeDirection() {
        switch (currentDirection) {
            case "East" -> currentDirection = "North";
            case "North" -> currentDirection = "West";
            case "West" -> currentDirection = "South";
            case "South" -> currentDirection = "East";
        }
    }

    private boolean foundFood(int x, int y, int tempX, int tempY) {
        if (x >= Math.min(tempX, currentX) && x <= Math.max(tempX, currentX) && y == currentY)  {
            return true;
        }

        if (y >= Math.min(tempY, currentY) && y <= Math.max(tempY, currentY) && x == currentX) {
            return true;
        }

        return false;
    }

}
