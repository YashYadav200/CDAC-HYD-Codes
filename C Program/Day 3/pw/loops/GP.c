#include <stdio.h>
int main()
{
    
    float a = 100;

    printf("The GP is :\n");

    for (int i = 0;a > 1; i++)
    {
        printf("%.2f\n",a);
        a = a / 2;
       
    }
}