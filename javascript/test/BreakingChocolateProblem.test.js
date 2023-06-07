const breakChocolate = require("./../main/BreakingChocolateProblem");

describe("Breaking chocolate problem", () => {
    test("breakChocolate() function test", () => {
        expect(breakChocolate(7, 4)).toEqual(27);
        expect(breakChocolate(5, 5)).toEqual(24);
        expect(breakChocolate(1, 1)).toEqual(0);
        expect(breakChocolate(0, 0)).toEqual(0);
        expect(breakChocolate(6, 1)).toEqual(5);
    })
})
