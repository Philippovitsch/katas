const firstNonRepeatingCharacter = require("./../main/FirstNonRepeatingCharacter");

describe("First Non Repeating Character", () => {

    const happyPaths = [
        ["a", "a"],
        ["ab", "a"],
        ["aab", "b"],
        ["baa", "b"],
        ["aba", "b"],
        ["stress", "t"],
        ["sTreSS", "T"],
        ["∞§ﬁ›ﬂ∞§", "ﬁ"],
        ["hello world, eh?", "w"],
        ["Go hang a salami, I'm a lasagna hog!", ","]
    ];

    const sadPaths = [
        ["", ""],
        ["aa", ""],
        ["aabb", ""],
        ["abba", ""]
    ];

    test("Should return first non-repeating letter", () => {
        happyPaths.forEach(testCase => {
            expect(firstNonRepeatingCharacter(testCase[0])).toEqual(testCase[1]);
        });
    })

    test("Should return empty string", () => {
        sadPaths.forEach(testCase => {
            expect(firstNonRepeatingCharacter(testCase[0])).toEqual(testCase[1]);
        });
    })

})
