#include <stdio.h>

int main() {
    int choice;
    float balance = 0.0, amount;

    while (1) {
        printf("Bank Menu\n");
        printf("1. Deposit Money\n");
        printf("2. Withdraw Money\n");
        printf("3. Check Balance\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: 
                printf("Enter amount to deposit: ");
                scanf("%f", &amount);
                if (amount > 0) {
                    balance = balance+amount;
                    printf(" Deposited: %.2f\n", amount);
                } else {
                    printf(" Invalid amount!\n");
                }
                break;

            case 2: 
                printf("Enter amount to withdraw: ");
                scanf("%f", &amount);
                if (amount > 0 && amount <= balance) {
                    balance = balance- amount;
                    printf("Withdrawn: %.2f\n", amount);
                } else {
                    printf("Insufficient balance\n");
                }
                break;

            case 3: 
                printf("Current Balance: %.2f\n", balance);
                break;

            case 4:
                printf("Exit\n");
                return 0;

            default:
                printf("Invalid choice!\n");
        }
    }
}