const longestConsec = require("./../main/ConsecutiveStrings");

describe("Consecutive String", () => {
    test("Invalid input", () => {
        expect(longestConsec([], -1)).toEqual("");
        expect(longestConsec([], 0)).toEqual("");
        expect(longestConsec([], 1)).toEqual("");
        expect(longestConsec(["tree", "fooling"], -1)).toEqual("");
        expect(longestConsec(["tree", "fooling"], 0)).toEqual("");
        expect(longestConsec(["tree", "fooling"], 3)).toEqual("");
    })

    const testWords1 = ["tree"];
    const testWords2 = ["ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"];
    const testWords3 = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"];
    const testWords4 = ["itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"];
    const testWords5 = ["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"];

    test("Valid input", () => {
        expect(longestConsec(testWords1, 1)).toEqual("tree");
        expect(longestConsec(testWords2, 1)).toEqual("oocccffuucccjjjkkkjyyyeehh");
        expect(longestConsec(testWords3, 2)).toEqual("folingtrashy");
        expect(longestConsec(testWords4, 2)).toEqual("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        expect(longestConsec(testWords5, 3)).toEqual("ixoyx3452zzzzzzzzzzzz");
    })
})
