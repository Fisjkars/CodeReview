#include <stdio.h>

// Function to calculate the factorial of a number
int factorial(int n) {
    if (n < 0) {
        printf("Error: Factorial of a negative number is undefined.\n");
        return -1;
    }
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

int main() {
    int number = 5;  // Change this number to test different inputs
    printf("Calculating factorial of %d...\n", number);

    // Intentional bug: wrong variable name
    int fact = factorial(number);
    printf("Factorial of %d is %d\n", number, fact);

    return 0;
}