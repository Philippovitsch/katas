const findPossibleNumbers = require("./../main/RecreationOne");

describe("Integers: Recreation One", () => {

    test("findPossibleNumbers() function test", () => {
        expect(findPossibleNumbers(1, 1)).toEqual([[1, 1]]);
        expect(findPossibleNumbers(1, 2)).toEqual([[1, 1]]);
        expect(findPossibleNumbers(1, 41)).toEqual([[1, 1]]);
        expect(findPossibleNumbers(1, 42)).toEqual([[1, 1], [42, 2500]]);
        expect(findPossibleNumbers(1, 43)).toEqual([[1, 1], [42, 2500]]);
        expect(findPossibleNumbers(1, 250)).toEqual([[1, 1], [42, 2500], [246, 84100]]);
        expect(findPossibleNumbers(42, 250)).toEqual([[42, 2500], [246, 84100]]);
        expect(findPossibleNumbers(250, 500)).toEqual([[287, 84100]]);
        expect(findPossibleNumbers(300, 600)).toEqual([]);
        expect(findPossibleNumbers(600, 1500)).toEqual([[728, 722500], [1434, 2856100]]);
        expect(findPossibleNumbers(1500, 1800)).toEqual([[1673, 2856100]]);
        expect(findPossibleNumbers(1800, 2000)).toEqual([[1880, 4884100]]);
        expect(findPossibleNumbers(2000, 2200)).toEqual([]);
        expect(findPossibleNumbers(2200, 5000)).toEqual([[4264, 24304900]]);
        expect(findPossibleNumbers(5000, 10000)).toEqual([[6237, 45024100], [9799, 96079204], [9855, 113635600]]);
    })

})
