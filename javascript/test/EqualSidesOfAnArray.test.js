const find = require("./../main/EqualSidesOfAnArray");

describe("Equal Sides Of An Array", () => {
    test("find() function test from Codewars", () => {
        expect(find([1,2,3,4,3,2,1])).toEqual(3);
        expect(find([1,100,50,-51,1,1])).toEqual(1);
        expect(find([1,2,3,4,5,6])).toEqual(-1);
        expect(find([20,10,30,10,10,15,35])).toEqual(3);
        expect(find([20,10,-80,10,10,15,35])).toEqual(0);
        expect(find([10,-80,10,10,15,35,20])).toEqual(6);
        expect(find([8,8])).toEqual(-1);
        expect(find([8,0])).toEqual(0);
        expect(find([0,8])).toEqual(1);
        expect(find([7,3,-3])).toEqual(0);
        expect(find([8])).toEqual(0);
        expect(find([0,0,0,0,0])).toEqual(0);
    })
})
