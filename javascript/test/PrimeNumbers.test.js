const { isPrime, getPrimes } = require("./../main/PrimeNumbers");

describe("Prime Numbers", () => {

    test("isPrime() function tests", () => {
        expect(isPrime(-1)).toEqual(false);
        expect(isPrime(0)).toEqual(false);
        expect(isPrime(1)).toEqual(false);
        expect(isPrime(2)).toEqual(true);
        expect(isPrime(3)).toEqual(true);
        expect(isPrime(4)).toEqual(false);
        expect(isPrime(5)).toEqual(true);
        expect(isPrime(43)).toEqual(true);
        expect(isPrime(44)).toEqual(false);
        expect(isPrime(47)).toEqual(true);
    })

    test("getPrimes() function tests", () => {
        expect(getPrimes(-1, 0)).toEqual([]);
        expect(getPrimes(0, 0)).toEqual([]);
        expect(getPrimes(-1, 10)).toEqual([2,3,5,7]);
        expect(getPrimes(0, 30)).toEqual([2,3,5,7,11,13,17,19,23,29]);
        expect(getPrimes(30, 0)).toEqual([2,3,5,7,11,13,17,19,23,29]);
    })

})
