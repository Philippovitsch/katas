const convert = require("./../main/ConvertStringToCamelCase");

describe("Convert String to Camel Case", () => {
    test("should handle empty values", () => {
        expect(convert('')).toEqual('');
    })
      
    test("should remove underscores and convert first letter of word to upper case", function(){
        expect(convert("A_B_C")).toEqual("ABC");
        expect(convert("a_b_c")).toEqual("aBC");
        expect(convert("the_stealth_warrior")).toEqual("theStealthWarrior");
        expect(convert("The_stealth_warrior")).toEqual("TheStealthWarrior");
    })
      
    test("should remove hyphens and convert first letter of word to upper case", function(){
        expect(convert("A-B-C")).toEqual("ABC");
        expect(convert("a-b-c")).toEqual("aBC");
        expect(convert("the-Stealth-Warrior")).toEqual("theStealthWarrior");
        expect(convert("The-Stealth-Warrior")).toEqual("TheStealthWarrior");
    })

    test("should remove both in one string, underscores and hyphens", () => {
        expect(convert("A-B_C")).toEqual("ABC");
        expect(convert("a-b_c")).toEqual("aBC");
        expect(convert("the_Stealth-Warrior")).toEqual("theStealthWarrior");
        expect(convert("The_Stealth-Warrior")).toEqual("TheStealthWarrior");
    })
})
