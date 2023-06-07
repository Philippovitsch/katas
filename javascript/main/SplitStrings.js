// Source: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

function split(string) {
    const length = string.length;
    if (length % 2 === 1) {
        string += "_";
    }

    const splitString = [];
    for (let i = 0; i < length; i += 2) {
        splitString.push(string.substring(i, i + 2));
    }
    return splitString;
}

module.exports = split;
