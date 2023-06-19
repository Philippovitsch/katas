const find = require("./../main/WhichAreIn");

describe("Which are in", () => {

    let words;
    let substrings;

    test("find() function test", () => {
        words = ["lively", "alive", "harp", "sharp", "armstrong"];
        substrings = ["arp", "live", "strong"];
        expect(find(substrings, words)).toEqual(["arp", "live", "strong"]);
        substrings = ["xyz", "live", "strong"];
        expect(find(substrings, words)).toEqual(["live", "strong"]);
        substrings = ["live", "strong", "arp"];
        expect(find(substrings, words)).toEqual(["arp", "live", "strong"]);
        substrings = ["tarp", "mice", "bull"];
        expect(find(substrings, words)).toEqual([]);
    })

})
