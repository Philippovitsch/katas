// Source: https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/javascript

function encrypt(text, numberOfRounds) {
    if (text === null) return null;
    let encryptedText = text;
    for (let i = 0; i < numberOfRounds; i++) {
        encryptedText = shuffleLetters(encryptedText);
    }
    return encryptedText;
}

function shuffleLetters(text) {
    let oddLetters = "";
    let evenLetters = "";
    for (let i = 0; i < text.length; i++) {
        (i % 2 === 0) ? evenLetters += text.charAt(i) : oddLetters += text.charAt(i);
    }
    return oddLetters + evenLetters;
}

function decrypt(encryptedText, numberOfRounds) {
    if (encryptedText === null) return null;
    let decryptedText = encryptedText;
    for (let i = 0; i < numberOfRounds; i++) {
        decryptedText = unshuffleLetters(decryptedText);
    }
    return decryptedText;
}

function unshuffleLetters(encryptedText) {
    const oddLetters = encryptedText.substring(0, encryptedText.length / 2);
    const evenLetters = encryptedText.substring(encryptedText.length / 2);
    let unshuffledLetters = "";
    for (let i = 0; i < encryptedText.length; i++) {
        unshuffledLetters += evenLetters.charAt(i) + oddLetters.charAt(i);
    }
    return unshuffledLetters;
}

module.exports = { encrypt, decrypt };
