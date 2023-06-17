// Source: https://www.codewars.com/kata/559a28007caad2ac4e000083

function calculate(numberOfSquares) {
    let sideLength1 = 0;
    let sideLength2 = 1;
    let sum = 0;
    for (let i = 0; i <= numberOfSquares + 1; i++) {
        sum += 4 * sideLength1;
        const newSideLength = sideLength1 + sideLength2;
        sideLength1 = sideLength2;
        sideLength2 = newSideLength;
    }
    return sum;
}

module.exports = calculate;
