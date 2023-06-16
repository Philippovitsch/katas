// Source: https://www.codewars.com/kata/55c6126177c9441a570000cc

function calculate(numbers) {
    const splitDigits = numbers.split(" ").map(number => number.split("")).sort(compareWeights);
    const splitNumbers = splitDigits.map(digits => digits.join(""))
    return splitNumbers.join(" ");
}

function compareWeights(firstDigits, secondDigits) {
    const firstWeight = sumNumbers(firstDigits.map(digit => parseInt(digit)));
    const secondWeight = sumNumbers(secondDigits.map(digit => parseInt(digit)));

    if (firstWeight === secondWeight) {
        const firstNumber = firstDigits.join("");
        const secondNumber = secondDigits.join("");
        return (firstNumber > secondNumber) ? 1 : -1;
    }

    return firstWeight - secondWeight;
}

function sumNumbers(numbers) {
    let sum = 0;
    numbers.forEach(number => sum += number);
    return sum;
}

module.exports =  calculate;
