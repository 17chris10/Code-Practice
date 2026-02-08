function calc(num1, num2, op) {
  let r;
  switch (op) {
    case '+':
      r = num1 + num2;
      break;
    case '-':
      r = num1 - num2;
      break;
    case '*':
      r = num1 * num2;
      break;
    case '/':
      if (num2 === 0) {
        return "Error: Division by zero is not allowed.";
      }
      r = num1 / num2;
      break;
    default:
      return "Error: Invalid operator. Please use +, -, *, or /.";
  }
  return `The result of ${num1} ${op} ${num2} is ${r}`;
}

console.log(calc(10, 5, '+'));
console.log(calc(10, 5, '-'));
console.log(calc(10, 5, '*'));
console.log(calc(10, 5, '/'));
console.log(calc(10, 0, '/'));
console.log(calc(10, 5, '%'));