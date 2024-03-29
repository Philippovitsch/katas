const pickPeaks = require("./../main/PickPeaks");

describe("Pick Peaks", () => {
    test("pickPeaks() function tests from Codewars", () => {
        expect(pickPeaks([])).toEqual({pos: [],peaks: []});
        expect(pickPeaks([1,1,1,1])).toEqual({pos: [],peaks: []});

        expect(pickPeaks([1,2,2,2,1])).toEqual({pos: [1], peaks: [2]});
        expect(pickPeaks([0,1,2,5,1,0])).toEqual({pos: [3], peaks: [5]});
        expect(pickPeaks([2,1,3,2,2,2,2,1])).toEqual({pos: [2], peaks: [3]});
        expect(pickPeaks([2,1,3,1,2,2,2,2])).toEqual({pos: [2], peaks: [3]});
        expect(pickPeaks([2,1,3,2,2,2,2,5,6])).toEqual({pos: [2], peaks: [3]});

        expect(pickPeaks([2,1,3,1,2,2,2,2,1])).toEqual({pos: [2,4], peaks: [3,2]});
        expect(pickPeaks([1,2,3,6,4,1,2,3,2,1])).toEqual({pos: [3,7], peaks: [6,3]});
        expect(pickPeaks([3,2,3,6,4,1,2,3,2,1,2,3])).toEqual({pos: [3,7], peaks: [6,3]});
        expect(pickPeaks([3,2,3,6,4,1,2,3,2,1,2,2,2,1])).toEqual({pos: [3,7,10], peaks: [6,3,2]});
        expect(pickPeaks([1,2,5,4,3,2,3,6,4,1,2,3,3,4,5,3,2,1,2,3,5,5,4,3])).toEqual({pos: [2,7,14,20], peaks: [5,6,5,5]});
    })
})
