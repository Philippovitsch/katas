const extractRange = require("./../main/RangeExtraction");

describe("Range Extraction", () => {
    test("Simple tests", () => {
        expect(extractRange([])).toEqual("");
        expect(extractRange([1])).toEqual("1");
        expect(extractRange([1,2])).toEqual("1,2");
        expect(extractRange([1,2,3])).toEqual("1-3");
        expect(extractRange([1,3,5])).toEqual("1,3,5");
        expect(extractRange([1,2,3,5])).toEqual("1-3,5");
    })

    const testNumbers1 = [-3,-2,-1,2,10,15,16,18,19,20];
    const testNumbers2 = [-10,-9,-8,-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20];
    const testNumbers3 = [20,21,522,523,524,525,526,548,549,560,562,563,564,1570,1571,1572,1574];

    test("More complex tests", () => {
        expect(extractRange(testNumbers1)).toEqual("-3--1,2,10,15,16,18-20");
        expect(extractRange(testNumbers2)).toEqual("-10--8,-6,-3-1,3-5,7-11,14,15,17-20");
        expect(extractRange(testNumbers3)).toEqual("20,21,522-526,548,549,560,562-564,1570-1572,1574");
    })
})
