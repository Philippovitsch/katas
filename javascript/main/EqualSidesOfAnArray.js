// Source: https://www.codewars.com/kata/5679aa472b8f57fb8c000047

function find(numbers) {
    for (let i = 0; i < numbers.length; i++) {
        const leftSide = numbers.slice(0, i);
        const rightSide = numbers.slice(i + 1, numbers.length);
        if (getSum(leftSide) === getSum(rightSide)) {
            return i;
        }
    }
    return -1;
}

function getSum(numbers) {
    let sum = 0;
    numbers.forEach(
        number => sum += number
    );
    return sum;
}

module.exports = find;
