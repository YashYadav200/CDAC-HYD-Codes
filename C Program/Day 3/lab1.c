#include <stdio.h>
int sumDivi(int n, int i) {
    if (i == 0)
        return 0;
    if (n % i == 0)
        return i + sumDivi(n, i - 1);
    else
        return sumDivi(n, i - 1);
}
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    int sum = sumDivi(num, num / 2);
    if (sum == num && num != 0)
        printf("%d is a Perfect Number\n", num);
    else
        printf("%d is NOT a Perfect Number\n", num);

    return 0;
}