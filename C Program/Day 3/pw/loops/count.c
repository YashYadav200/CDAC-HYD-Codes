#include <stdio.h>
int main (){
    printf("Count number of digits are\n");
    int a = 1425;
    int count = 0;
    while (a != 0)
    {
        a = a/10;
        count++;
    }
    printf("%d \ndigit in number",count);
    return 0;
}