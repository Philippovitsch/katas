// Source: https://www.codewars.com/kata/52dd72494367608ac1000416

function isPrime(number) {
    if (number < 2) {
        return false;
    }
    for (let i = 2; i <= number / 2; i++) {
        if (number % i === 0) {
            return false;
        }
    }
    return true;
}

function getPrimes(start, finish) {
    const lowerNumber = start <= finish ? start : finish;
    const higherNumber = start <= finish ? finish : start;
    const primeNumbers = [];
    for (let i = lowerNumber; i <= higherNumber; i++) {
        if (isPrime(i)) {
            primeNumbers.push(i);
        }
    }
    return primeNumbers;
}

module.exports = { isPrime, getPrimes };
