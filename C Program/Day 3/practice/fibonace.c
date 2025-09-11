#include <stdio.h>
int main()
{
    int nxt = 0;
    int sum = 1;
    int fibo = 0;
    printf("Fibonacce series is \n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d  ", fibo);
        fibo = nxt + sum;
        sum = nxt;
        nxt = fibo;
    }
}