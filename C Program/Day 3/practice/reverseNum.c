#include <stdio.h>
int main()
{
    int num = 1234;
    int rev = 0;
    int sum =0;

    for (int i = 0; i < 4; i++)
    {

        
        rev = rev * 10 + (num % 10);
        num = num / 10;
        sum = rev + sum;
        
    }
    printf("%d\n", rev);
    printf("%d", sum);
}