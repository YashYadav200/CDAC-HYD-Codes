#include <stdio.h>
int main(){
    int pow = 1;
    int a;
    int b;
    printf("Enter number\n");
    scanf("%d%d", &a,&b);
    for (int i = 0; i < b; i++)
    {
        pow = a * pow;
    }
    printf("%d",pow);
    
    return 0;
}