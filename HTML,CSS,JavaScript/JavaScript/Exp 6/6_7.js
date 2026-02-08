let n = prompt("Enter a number to check if it's even or odd:");
n = parseInt(n);
if (n % 2 === 0) {
  console.log("Even number.");
} else {
  console.log("Odd number.");
}
let n1 = prompt("Enter the first number:");
let n2 = prompt("Enter the second number:");
let n3 = prompt("Enter the third number:");
n1 = parseInt(n1);
n2 = parseInt(n2);
n3 = parseInt(n3);
let l;
if (n1 >= n2 && n1 >= n3) {
  l = n1;
} else if (n2 >= n1 && n2 >= n3) {
  l = n2;
} else {
  l = n3;
}
console.log(`The largest number is ${l}.`);
