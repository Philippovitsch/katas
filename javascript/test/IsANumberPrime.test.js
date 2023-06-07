const isPrime = require("./../main/IsANumberPrime");

describe("Is A Number Prime", () => {
    test("Invalid input", () => {
        expect(isPrime(-1259)).toEqual(false);
        expect(isPrime(-2)).toEqual(false);
        expect(isPrime(-1)).toEqual(false);
        expect(isPrime(0)).toEqual(false);
        expect(isPrime(1)).toEqual(false);
    });

    test("Test prime", () => {
        expect(isPrime(2)).toEqual(true);
        expect(isPrime(3)).toEqual(true);
        expect(isPrime(5)).toEqual(true);
        expect(isPrime(7)).toEqual(true);
        expect(isPrime(41)).toEqual(true);
        expect(isPrime(5099)).toEqual(true);
    });

    test("Test not prime", () => {
        expect(isPrime(4)).toEqual(false);
        expect(isPrime(6)).toEqual(false);
        expect(isPrime(8)).toEqual(false);
        expect(isPrime(9)).toEqual(false);
        expect(isPrime(10)).toEqual(false);
        expect(isPrime(45)).toEqual(false);
    });
})
