const findMissingLetter = require("../main/FindTheMissingLetter");

describe("Find The Missing Letter", () => {
    test("Letter missing at the beginning", () => {
        expect(findMissingLetter(["a","b","c","d","f"])).toEqual("e");
        expect(findMissingLetter(["A","B","C","D","F"])).toEqual("E");
    })

    test("Letter missing at the end", () => {
        expect(findMissingLetter(["g","i","j","k","l"])).toEqual("h");
        expect(findMissingLetter(["G","I","J","K","L"])).toEqual("H");
    })

    test("Letter missing in the middle", () => {
        expect(findMissingLetter(["m","n","p","q"])).toEqual("o");
        expect(findMissingLetter(["M","N","P","Q"])).toEqual("O");
    })

    test("Short array", () => {
        expect(findMissingLetter(["a","c"])).toEqual("b");
        expect(findMissingLetter(["X", "Z"])).toEqual("Y");
    })

    test("Long array", () => {
        expect(findMissingLetter(["a","b","c","d","e","f","g","h","i","j","l","m","n","o","p"])).toEqual("k");
        expect(findMissingLetter(["K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"])).toEqual("O");
    })
})
