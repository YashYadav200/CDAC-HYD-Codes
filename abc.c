
#include <stdio.h>

int main() {
    int num;
    
    // Taking input from user
    printf("Enter a number: ");
    scanf("%d", &num);

    // Checking even or odd
    if (num % 2 == 0) {
        printf("The number %d is Even.\n", num);
    } else {
        printf("The number %d is Odd.\n", num);
    }

    return 0;
}

