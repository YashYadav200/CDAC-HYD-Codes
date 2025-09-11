#include <stdio.h>
int fact(int);
int main()
{
    int a;
    printf("Enter the Number");
    scanf("%d",&a);
    int res = fact(a);
    printf("Factorial is %d", res);
}

int fact (int n)
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else{
        return n * fact(n - 1);
    }
        return 0;
}