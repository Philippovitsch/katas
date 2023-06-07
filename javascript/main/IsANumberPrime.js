// Source: https://www.codewars.com/kata/5262119038c0985a5b00029f

function isPrime(number) {
    if (number <= 1) {
        return false;
    }

    const limit = Math.sqrt(number);
    for (let divisor = 2; divisor <= limit; divisor++) {
        if (number % divisor === 0) {
            return false;
        }
    }
    return true;
}

module.exports = isPrime;
