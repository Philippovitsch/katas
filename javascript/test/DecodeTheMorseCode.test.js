const decode = require("./../main/DecodeTheMorseCode");

describe("Decode The Morse Code", () => {
    test("Basic Morse decoding", () => {
        expect(decode('.-')).toEqual('A');
        expect(decode('.')).toEqual('E');
        expect(decode('..')).toEqual('I');
        expect(decode('. .')).toEqual('EE');
        expect(decode('.   .')).toEqual('E E');
        expect(decode('...---...')).toEqual('SOS');
        expect(decode('... --- ...')).toEqual('SOS');
        expect(decode('...   ---   ...')).toEqual('S O S');
    })

    test("Leading and trailing spaces", () => {
        expect(decode(' . ')).toEqual('E');
        expect(decode('   .   . ')).toEqual('E E');
        expect(decode('   .... . -.--   ')).toEqual('HEY');
    })

    test("More complex tests", () => {
        expect(decode('.... . -.--   .--- ..- -.. .')).toEqual('HEY JUDE');
        expect(
            decode('      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  '))
            .toEqual('SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.'
        );
    })
})
