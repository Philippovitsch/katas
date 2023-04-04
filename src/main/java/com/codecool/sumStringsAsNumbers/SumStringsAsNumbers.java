package com.codecool.sumStringsAsNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumStringsAsNumbers {

    public String calculateSum(String number1, String number2) {
        int maxLength = Math.max(number1.length(), number2.length());
        String reversedNumber1 = reverseNumber(number1);
        String reversedNumber2 = reverseNumber(number2);

        String result = "";
        int rest = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit1 = getSingleDigit(reversedNumber1, i);
            int digit2 = getSingleDigit(reversedNumber2, i);
            result += (digit1 + digit2 + rest) % 10;
            rest = Math.floorDiv((digit1 + digit2 + rest), 10);
        }
        result = (rest == 1) ? result + "1" : result;
        return reverseNumber(result).replaceAll("^0+(?!$)", "");
    }

    private String reverseNumber(String number) {
        List<Character> digits = new ArrayList<>(number.chars()
                .mapToObj(character -> (char) character)
                .toList());
        Collections.reverse(digits);
        return digits.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    private int getSingleDigit(String number, int index) {
        try {
            return Character.getNumericValue(number.charAt(index));
        } catch (StringIndexOutOfBoundsException ignored) {
            return 0;
        }
    }

}
