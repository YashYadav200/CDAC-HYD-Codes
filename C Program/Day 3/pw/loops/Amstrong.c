#include <stdio.h>
int main()
{
    int num;
    int div = 1;
    int sum = 0;
    int pow = 1;
    int num1;
    int num2;
    int count = 0;


    printf("Enter the Number : ");
    scanf("%d", &num);
    num1 = num2 = num;
    while (num2 != 0)
    {
        num2 = num2 / 10;
        count++;
    }
   

    for (int i = 0; i < count; i++)
    { 
        div = num % 10;
        pow= 1;
       for (int c = 0; c < count; c++)
       { 
            pow = div * pow;
            
        }
       
        sum = sum + pow;
        num = num / 10;
    }

    if (num1 == sum)
    {
        printf(" %d  Number is a Amstromg Number", num1);
    }
    else
    {
        printf("%d Number is Not a Amstromg Number", num1);
    }
}