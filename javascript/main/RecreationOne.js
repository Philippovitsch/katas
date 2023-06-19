// Source: https://www.codewars.com/kata/55aa075506463dac6600010d

function findPossibleNumbers(min, max) {
    const possibleNumbers = [];
    for (let i = min; i <= max; i++) {
        const divisors = findDivisors(i).map(divisor => divisor ** 2);
        const sum = findSum(divisors);
        const sumSquare = Math.sqrt(sum);
        if (Number.isInteger(sumSquare)) {
            possibleNumbers.push([i, sum]);
        }
    }
    return possibleNumbers;
}

function findDivisors(number) {
    const divisors = [];
    for (let i = 1; i <= number; i++) {
        if (number % i === 0) {
            divisors.push(i);
        }
    }
    return divisors;
}

function findSum(divisors) {
    let sum = 0;
    divisors.forEach(divisor => sum += divisor);
    return sum;
}

module.exports = findPossibleNumbers;
