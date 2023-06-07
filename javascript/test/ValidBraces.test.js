const validBraces = require("./../main/ValidBraces");

describe("Valid Braces", () => {
    test("Return true", () => {
        expect(validBraces("()")).toEqual(true);
        expect(validBraces("{}")).toEqual(true);
        expect(validBraces("[]")).toEqual(true);
        expect(validBraces("(){}[]")).toEqual(true);
        expect(validBraces("([{}])")).toEqual(true);
    })

    test("Return false", () => {
        expect(validBraces("(}")).toEqual(false);
        expect(validBraces("()}")).toEqual(false);
        expect(validBraces("(})")).toEqual(false);
        expect(validBraces("[(])")).toEqual(false);
        expect(validBraces("()))")).toEqual(false);
    })

    test("More complicated patterns", () => {
        expect(validBraces(")(}{][")).toEqual(false);
        expect(validBraces("(((({{")).toEqual(false);
        expect(validBraces("{}({})[]")).toEqual(true);
        expect(validBraces("[({})](]")).toEqual(false);
        expect(validBraces("}}]]))}])")).toEqual(false);
        expect(validBraces("({})[({})]")).toEqual(true);
        expect(validBraces("(({{[[]]}}))")).toEqual(true);
        expect(validBraces("())({}}{()][][")).toEqual(false);
    })
})
