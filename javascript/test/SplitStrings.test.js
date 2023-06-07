const split = require("./../main/SplitStrings");

describe("Split Strings", () => {
    test("split() function test", () => {
        expect(split("")).toEqual([]);
        expect(split("a")).toEqual(["a_"]);
        expect(split("ab")).toEqual(["ab"]);
        expect(split("abc")).toEqual(["ab","c_"]);
        expect(split("abcd")).toEqual(["ab", "cd"]);
        expect(split("abcde")).toEqual(["ab", "cd", "e_"]);
        expect(split("abcdef")).toEqual(["ab", "cd", "ef"]);
    })
})
