// Source: https://www.codewars.com/kata/5279f6fe5ab7f447890006a7

function pickPeaks(numbers) {
    const result = {pos: [], peaks: []};
    for (let i = 1; i < numbers.length - 1; i++) {
        if (isPeak(numbers, i) || isPlateau(numbers, i)) {
            result.pos.push(i);
            result.peaks.push(numbers[i]);
        }
    }
    return result;
}

function isPeak(numbers, i) {
    return numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1];
}

function isPlateau(numbers, i) {
    const hasPlateauBegin = numbers[i] > numbers [i - 1];
    let hasPlateauEnd = false;

    for (let j = i; j < numbers.length; j++) {
        if (numbers[j] > numbers[i]) {
            break;
        }
        if (numbers[j] < numbers[i]) {
            hasPlateauEnd = true;
            break;
        }
    }
    return hasPlateauBegin && hasPlateauEnd;
}

module.exports = pickPeaks;
