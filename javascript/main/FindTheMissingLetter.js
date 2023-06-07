// Source: https://www.codewars.com/kata/5839edaa6754d6fec10000a2

function findMissingLetter(letters) {
    let expectedChar = letters[0].charCodeAt(0);
    for (let i = 0; i < letters.length; i++) {
        const currentChar = letters[i].charCodeAt(0);
        if (currentChar !== expectedChar) {
            const missingLetter = letters[i].charCodeAt(0) - 1;
            return String.fromCharCode(missingLetter);
        }
        expectedChar++;
    }
}

module.exports = findMissingLetter;
