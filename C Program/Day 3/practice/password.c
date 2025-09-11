#include <stdio.h>
int main()
{
    int a=0;
    int b=0;
    int combo;

    for (int i = 0; i <= 9999 ; i++)
    {
        if (i == 4532)
        {
            printf("password is %d", i);
            break;
        }
        else{
        combo = a + i;
        printf("%.4d ", combo);
        }

    }
    return 0;
}