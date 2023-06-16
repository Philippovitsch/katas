// Source: https://www.codewars.com/kata/52bc74d4ac05d0945d00054e

function firstNonRepeatingCharacter(word) {
    for (let i = 0; i < word.length; i++) {
        if (count(word[i], word) === 1) {
            return word[i];
        }
    }
    return "";
}

function count(requiredLetter, word) {
    const letters = word.toLowerCase().split("");
    return letters.filter(element => element === requiredLetter.toLowerCase()).length;
}

module.exports = firstNonRepeatingCharacter;
