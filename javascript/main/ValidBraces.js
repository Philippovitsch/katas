// Source: https://www.codewars.com/kata/5277c8a221e209d3f6000b56

function validBraces(braces) {
    const braceStack = [];

    [...braces].forEach(brace => {
        if (brace === ")" && braceStack[braceStack.length - 1] === "(") {
            braceStack.pop();
        } else if (brace === "}" && braceStack[braceStack.length - 1] === "{") {
            braceStack.pop();
        } else if (brace === "]" && braceStack[braceStack.length - 1] === "[") {
            braceStack.pop();
        } else {
            braceStack.push(brace);
        }
    });

    return braceStack.length === 0;
}

module.exports = validBraces;
