const calculate = require("./../main/PerimeterOfSquaresInRectangle");

describe("Perimeter Of Squares In A Rectangle", () => {

    const testCases = [
        [0, 4],
        [1, 8],
        [2, 16],
        [5, 80],
        [10, 928],
        [15, 10332],
        [20, 114624],
        [30, 14098308],
        [40, 1733977744],
        [50, 213265164688],
        [60, 26229881279364],
        [70, 3226062132197568]
    ];

    test("calculate() function test", () => {
        testCases.forEach(testCase => {
            expect(calculate(testCase[0])).toEqual(testCase[1]);
        })
    })

})
