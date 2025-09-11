#include<stdio.h>
int main(){
    int n;
    int sum=0;
    printf("Sum of Natural Number\n");
    scanf("%d",&n);
    for (int i = 1; i <= n; i++)
    {
        sum = i + sum;
    }
    printf("Sum is %d",sum);
    
}