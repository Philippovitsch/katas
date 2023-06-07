// Source: https://www.codewars.com/kata/517abf86da9663f1d2000003

function toCamelCase(words) {
    const splitWords = words.split(/[-_]/);
    const convertedSplitWords = [splitWords[0]];
    for (let i = 1; i < splitWords.length; i++) {
        const convertedWord = splitWords[i][0].toUpperCase() + splitWords[i].substring(1);
        convertedSplitWords.push(convertedWord);
    }
    return convertedSplitWords.join("");
}

module.exports = toCamelCase;
