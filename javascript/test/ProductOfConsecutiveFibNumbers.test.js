const calculate = require("./../main/ProductOfConsecutiveFibNumbers");

describe("Product Of Consecutive Fib Numbers", () => {

    const positiveTestCases = [
        [0, [0, 1, true]],
        [1, [1, 1, true]],
        [2, [1, 2, true]],
        [6, [2, 3, true]],
        [40, [5, 8, true]],
        [714, [21, 34, true]],
        [4895, [55, 89, true]],
        [602070, [610, 987, true]],
        [74049690, [6765, 10946, true]],
        [193864606, [10946, 17711, true]]
    ];

    const negativeTestCases = [
        [3, [2, 3, false]],
        [4, [2, 3, false]],
        [5, [2, 3, false]],
        [7, [3, 5, false]],
        [39, [5, 8, false]],
        [41, [8, 13, false]],
        [800, [34, 55, false]],
        [5895, [89, 144, false]],
        [447577, [610, 987, false]],
        [84049690, [10946, 17711, false]]
    ];

    test("Should return true", () => {
        positiveTestCases.forEach(testCase => {
            expect(calculate(testCase[0])).toEqual(testCase[1]);
        })
    })

    test("Should return false", () => {
        negativeTestCases.forEach(testCase => {
            expect(calculate(testCase[0])).toEqual(testCase[1]);
        })
    })

})
