// Source: https://www.codewars.com/kata/51ba717bb08c1cd60f00002f

function extractRange(numbers) {
    if (numbers.length === 0) {
        return "";
    }

    let ranges = numbers[0].toString();
    for (let i = 1; i < numbers.length; i++) {
        if (isRangeEnd(numbers, i)) {
            ranges += "-" + numbers[i];
            continue;
        }
        if (isNoRange(numbers, i)) {
            ranges += "," + numbers[i];
        }
    }

    return ranges;
}

function isRangeEnd(numbers, i) {
    return numbers[i] - 2 === numbers[i - 2] && numbers[i] + 1 !== numbers[i + 1];
}

function isNoRange(numbers, i) {
    return numbers[i] - 1 !== numbers[i - 1] || (numbers[i] - 1 === numbers[i - 1] && numbers[i] + 1 !== numbers[i + 1]);
}

module.exports = extractRange;
