// Source: https://www.codewars.com/kata/56a5d994ac971f1ac500003e

function longestConsec(words, numberOfWords) {
    if (words.length === 0 || numberOfWords > words.length || numberOfWords <= 0) {
        return "";
    }

    let consecutiveString = "";
    for (let i = 0; i < words.length; i++) {
        const currentConsecutiveString = words.slice(i, i + numberOfWords).join("");
        if (currentConsecutiveString.length > consecutiveString.length) {
            consecutiveString = currentConsecutiveString;
        }
    }

    return consecutiveString;
}

module.exports = longestConsec;
