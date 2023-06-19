const { encrypt, decrypt } = require("./../main/SimpleEncryption1");

describe("Simple Encryption #1", () => {

    test("Encryption tests", () => {
        expect(encrypt("This is a test!", -1)).toEqual("This is a test!");
        expect(encrypt("This is a test!", 0)).toEqual("This is a test!");
        expect(encrypt("This is a test!", 1)).toEqual("hsi  etTi sats!");
        expect(encrypt("This is a test!", 2)).toEqual("s eT ashi tist!");
        expect(encrypt("This is a test!", 3)).toEqual(" Tah itse sits!");
        expect(encrypt("This is a test!", 4)).toEqual("This is a test!");
        expect(encrypt("This kata is very interesting!", 1)).toEqual("hskt svr neetn!Ti aai eyitrsig");
    })

    test("Decryption tests", function(){
        expect(decrypt("This is a test!", -1)).toEqual("This is a test!");
        expect(decrypt("This is a test!", 0)).toEqual("This is a test!");
        expect(decrypt("hsi  etTi sats!", 1)).toEqual("This is a test!");
        expect(decrypt("s eT ashi tist!", 2)).toEqual("This is a test!");
        expect(decrypt(" Tah itse sits!", 3)).toEqual("This is a test!");
        expect(decrypt("This is a test!", 4)).toEqual("This is a test!");
        expect(decrypt("hskt svr neetn!Ti aai eyitrsig", 1)).toEqual("This kata is very interesting!");
    });

    test("Encryption tests with null or empty string", function(){
        expect(encrypt("", -1)).toEqual("");
        expect(encrypt("", 0)).toEqual("");
        expect(encrypt("", 1)).toEqual("");
        expect(encrypt(null, -1)).toEqual(null);
        expect(encrypt(null, 0)).toEqual(null);
        expect(encrypt(null, 1)).toEqual(null);
    });

    test("Decryption tests with null or empty string", function(){
        expect(decrypt("", -1)).toEqual("");
        expect(decrypt("", 0)).toEqual("");
        expect(decrypt("", 1)).toEqual("");
        expect(decrypt(null, -1)).toEqual(null);
        expect(decrypt(null, 0)).toEqual(null);
        expect(decrypt(null, 1)).toEqual(null);
    });

})
