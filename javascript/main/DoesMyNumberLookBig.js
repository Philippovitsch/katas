// Source: https://www.codewars.com/kata/5287e858c6b5a9678200083c

function calculate(number) {
    const digits = number.toString().split("").map(Number);
    const exponent = digits.length;
    
    let sum = 0;
    digits.forEach(digit => {
        sum += digit ** exponent;
    })

    return number == sum;
}

module.exports = calculate;
