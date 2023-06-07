const calculate = require("./../main/DoesMyNumberLookBig");

describe("Does my number look big in this?", () => {
    test("Narcissistic numbers", () => {
        expect(calculate(7)).toEqual(true);
        expect(calculate(153)).toEqual(true);
    })

    test("Not narcissistic numbers", () => {
        expect(calculate(122)).toEqual(false);
        expect(calculate(487)).toEqual(false);
        expect(calculate(1652)).toEqual(false);
    })
})
