#include<stdio.h>
int main(){
    printf("Mathamatical Tables\n");
    int a;
    int mul=1;
    printf("Enter number number\n");
    scanf("%d",&a);
    printf("The table of %d is :\n",a);
    for (int i = 1; i <= 10; i++)
    {
        mul = i * a;
        printf("%d * %d  = %d\n",a,i,mul);
    }
    
}