// calc.js

function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) return "Cannot divide by zero";
    return a / b;
}

function square(a) {
    return Math.pow(a, 2);  
}

function min(a, b, c) {
    return Math.min(a, b, c);  
}

function max(a, b, c) {
    return Math.max(a, b, c);  
}

module.exports = { add, subtract, multiply, divide, square, min, max };
