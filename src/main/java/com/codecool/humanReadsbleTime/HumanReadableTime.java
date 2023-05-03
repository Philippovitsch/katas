package com.codecool.humanReadsbleTime;

public class HumanReadableTime {

    // Source: https://www.codewars.com/kata/52685f7382004e774f0001f7

    private final int HOURS = 3600;
    private final int MINUTES = 60;

    public String makeReadable(int seconds) {
        int convertedHours = Math.floorDiv(seconds, HOURS);
        int convertedMinutes = Math.floorDiv(seconds % HOURS, MINUTES);
        int convertedSeconds = (seconds % HOURS) % MINUTES;
        return String.format(
                "%02d:%02d:%02d",
                convertedHours,
                convertedMinutes,
                convertedSeconds

        );
    }

}
