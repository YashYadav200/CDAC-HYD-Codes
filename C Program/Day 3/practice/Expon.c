#include<stdio.h>
int main(){
    int a;
    int b;
    int exp=0;
    printf("Enter they Base\n");
    scanf("%d",&a);
    printf("Enter they power\n");
    scanf("%d",&b);
    for (int i =0; i <=b; i++)
    {
        exp = a*i;

    }
    printf("%d",exp);
    
}