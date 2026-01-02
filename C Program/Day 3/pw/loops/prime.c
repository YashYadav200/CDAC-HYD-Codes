#include <stdio.h>
int main()
{
    int p;
    int num;
    int a = 0;
    printf("Enter they number \n");
    scanf("%d", &num);
    if (num == 1)
    {
        printf("Number is Nieter prime or composite\n");
    }

    for (int i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            
            a = 1;
            break;
        }
    }
    if (a == 0)
    {
        printf("prime number %d\n", num);
    }
    else
    {
        printf("Composite number %d\n", num);
    }

    return 0;
}