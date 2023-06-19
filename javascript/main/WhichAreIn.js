// Source: https://www.codewars.com/kata/550554fd08b86f84fe000a58

function find(substrings, words) {
    const appearingSubstrings = [];
    substrings.forEach(substring => {
        if (appearsIn(words, substring)) {
            appearingSubstrings.push(substring);
        }
    });
    return appearingSubstrings.sort();
}

function appearsIn(words, substring) {
    return words.filter(word => word.includes(substring)).length > 0;
}

module.exports = find;
