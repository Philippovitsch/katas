// Source: https://www.codewars.com/kata/55c04b4cc56a697bb0000048

function scramble(word1, word2) {
    const charsWord1 = getNumberOfEachCharacter(word1);
    const charsWord2 = getNumberOfEachCharacter(word2);

    let isPortion = true;
    Object.keys(charsWord2).forEach(char => {
        if (charsWord1[char] === undefined || charsWord1[char] < charsWord2[char]) {
            isPortion = false;
        }
    })

    return isPortion;
}

function getNumberOfEachCharacter(word) {
    let charMap = {};
    for (let char of word) {
        if (!charMap[char]) {
            charMap[char] = 1;
        } else {
            charMap[char]++;
        }
    }
    return charMap;
}

module.exports = scramble;
