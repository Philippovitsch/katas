// Source: https://www.codewars.com/kata/55983863da40caa2c900004e

function getNextBiggerNumber(number) {
    const digits = String(number).split("");

    let i = digits.length - 2;
    while (i >= 0 && digits[i] >= digits[i + 1]) {
        i--;
    }

    if (i === -1) {
        return -1;
    }

    let j = digits.length - 1;
    while (digits[j] <= digits[i]) {
        j--;
    }

    const tempDigit = digits[i];
    digits[i] = digits[j];
    digits[j] = tempDigit;

    const leftSideDigits = digits.slice(0, i + 1).join("");
    const rightSideDigits = digits.slice(i + 1).reverse().join("");

    return parseInt(leftSideDigits + rightSideDigits);
}

module.exports = getNextBiggerNumber;
