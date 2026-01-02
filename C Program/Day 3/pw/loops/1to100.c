#include <stdio.h>
int main()
{
    int a;
    printf("enter");
    scanf("%d", &a);
    for (int i = 1; i < a; i++)
    {
        if (a == i * i)
        {
            printf("square\n");
        }
        else
        {
            printf("not");
        }
    }
}