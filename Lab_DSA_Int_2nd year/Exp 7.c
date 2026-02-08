#include <stdio.h>

// 1. Fibonacci series using recursion
int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// 2. Factorial of a given number using recursion
long long factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

// 3. Counting the digits in a number using recursion
int countDigits(int n) {
    if (n == 0) {
        return 1;
    }
    return 1 + countDigits(n / 10);
}

// 4. Sum of digits using recursion
int sumDigits(int n) {
    if (n == 0) {
        return 0;
    }
    return (n % 10) + sumDigits(n / 10);
}

// 5. Sum of 0 to n numbers using recursion
int sumNumbers(int n) {
    if (n == 0) 
        return 0;
    return n + sumNumbers(n - 1);
}

int main() {
    int num = 5;
    int digitNum = 12345;
    int sumNum = 987;
    int sumN = 10;

    printf("Fibonacci series up to %d:\n", num);
    for (int i = 0; i < num; i++) {
        printf("%d ", fibonacci(i));
    }
    printf("\n\n");

    printf("Factorial of %d is: %lld\n\n", num, factorial(num));

    printf("Number of digits in %d is: %d\n\n", digitNum, countDigits(digitNum));

    printf("Sum of digits of %d is: %d\n\n", sumNum, sumDigits(sumNum));
    
    printf("Sum of numbers from 0 to %d is: %d\n", sumN, sumNumbers(sumN));

    return 0;
}