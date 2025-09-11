#include <stdio.h>
int add(int x, int y);
int sub(int x, int y);
int mul(int x, int y);
int divison(int x, int y);
int power(int x, int y);
int Reverse(int x);
int DigitCount(int x);
int DigitSum(int x);

// codes
int DigitSum(int x)
{
    int mod = 0, rev = 0, sum = 0;
    for (int i = 0; x != 0; i++)
    {
        mod = x % 10;
        sum = mod + sum;
        x = x / 10;
    }
    return sum;
}

int DigitCount(int x)
{
    int count = 0;
    while (x != 0)
    {
        x = x / 10;
        count++;
    }
    return count;
}
int add(int x, int y)
{
    int sum = 0;
    sum = x + y;
    return sum;
}
int sub(int x, int y)
{
    int sub = 0;
    sub = x - y;
    return sub;
}
int mul(int x, int y)
{
    int m = 1;
    m = x * y;
    return m;
}
int divison(int x, int y)
{
    int div;
    if (y == 0)
    {
        return y;
    }
    else
    {
        div = x / y;
        return div;
    }
}
int power(int x, int y)
{
    int pow = 1;
    for (int i = 0; i < y; i++)
    {
        pow = x * pow;
    }
    return pow;
}
int Reverse(int x)
{
    int rev = 0, mod = 0;

    for (int i = 0; x != 0; i++)
    {
        rev = rev * 10 + x % 10;
        x = x / 10;
    }
    return rev;
}
int main()
{
    int a, b;
    int n;
    do
    {

        printf("\nUse these Functions:\n");
        printf("1. Add\n2. Subtract\n3. Multiply\n4. Divison\n5. Power\n6. Reverse\n7. Digit Count\n8. Digit Sum\n9. Exit\nChoose Function: ");
        scanf("%d", &n);

        switch (n)
        {
        case 1:
            printf("Enter the Number : ");
            scanf("%d %d", &a, &b);
            printf("Sum is %d", add(a, b));
            break;
        case 2:
            printf("Enter the Number:");
            scanf("%d %d", &a, &b);
            printf("Subtraction  is %d", sub(a, b));
            break;
        case 3:
            printf("Enter the Number:");
            scanf("%d %d", &a, &b);
            printf("Multiplication  is %d", mul(a, b));
            break;
        case 4:
            printf("Enter the Number:");
            scanf("%d%d", &a, &b);
            printf("Division is %d", divison(a, b));
            break;
        case 5:
            printf("Enter the Number:");
            scanf("%d  %d", &a, &b);
            printf("Power is %d", power(a, b));
            break;
        case 6:
            printf("Enter the Number:");
            scanf("%d", &a);
            printf("Reverse is %d", Reverse(a));
            break;
        case 7:
            printf("Enter the Number:");
            scanf("%d", &a);
            printf("Digit Count is %d", DigitCount(a));
            break;
        case 8:
            printf("Enter the Number:");
            scanf("%d", &a);
            printf("Sum of digit is %d", DigitSum(a));
            break;
        default:
            break;
        }
    } while (n != 9);
}