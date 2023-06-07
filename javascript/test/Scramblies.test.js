const scramble = require("./../main/Scramblies");

describe("Scramblies", () => {
    test("Basic function tests", () => {
        expect(scramble('', '')).toEqual(true);
        expect(scramble('a', 'a')).toEqual(true);
        expect(scramble('ab', 'a')).toEqual(true);
        expect(scramble('a', 'ab')).toEqual(false);
        expect(scramble('ab', 'ab')).toEqual(true);
    })

    test("Fixed tests from Codewars", () => {
        expect(scramble('rkqodlw', 'world')).toEqual(true);
        expect(scramble('cedewaraaossoqqyt', 'codewars')).toEqual(true);
        expect(scramble('katas', 'steak')).toEqual(false);
        expect(scramble('scriptjavx', 'javascript')).toEqual(false);
        expect(scramble('scriptingjava', 'javascript')).toEqual(true);
        expect(scramble('scriptsjava', 'javascripts')).toEqual(true);
        expect(scramble('javscripts', 'javascript')).toEqual(false);
        expect(scramble('jscripts', 'javascript')).toEqual(false);
        expect(scramble('aabbcamaomsccdd', 'commas')).toEqual(true);
        expect(scramble('commas', 'commas')).toEqual(true);
        expect(scramble('sammoc', 'commas')).toEqual(true);
    })
})
