const getNextBiggerNumber = require("./../main/NextBiggerNumberWithSameDigits");

describe("Next Bigger Number With The Same Digits", () => {
    const happyPaths = [
        [12, 21],
        [49, 94],
        [144, 414],
        [414, 441],
        [513, 531],
        [2017, 2071],
        [9341, 9413],
        [1234567890, 1234567908],
        [3999887777311100, 7001113377788999]
    ];
    const sadPaths = [
        [1, -1],
        [10, -1],
        [11, -1],
        [100, -1],
        [222, -1],
        [531, -1],
        [7210, -1],
        [9876543210, -1],
        [99998885432110, -1]
    ];

    test("Returns next bigger number", () => {
        happyPaths.forEach(path => {
            expect(getNextBiggerNumber(path[0])).toEqual(path[1]);
        })
    })

    test("Returns -1", () => {
        sadPaths.forEach(path => {
            expect(getNextBiggerNumber(path[0])).toEqual(path[1]);
        })
    })

})
