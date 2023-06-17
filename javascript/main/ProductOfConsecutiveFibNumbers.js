// Source: https://www.codewars.com/kata/5541f58a944b85ce6d00006a

function calculate(product) {
    let fibNumber1 = 0;
    let fibNumber2 = 1;

    while (fibNumber1 * fibNumber2 <= product) {
        if (fibNumber1 * fibNumber2 === product) {
            return [fibNumber1, fibNumber2, true];
        }

        const nextFibNumber = fibNumber1 + fibNumber2;
        fibNumber1 = fibNumber2;
        fibNumber2 = nextFibNumber;
    }

    return [fibNumber1, fibNumber2, false];
}

module.exports = calculate
