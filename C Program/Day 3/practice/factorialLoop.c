#include<stdio.h>
int main(){
    int fact=1;
    int n;
    printf("Enter they Number : \n");
    scanf("%d",&n);
    printf("Factorial number are \n");
    for (int i = 1 ; i <= n  ; i++)
    {   
       fact = fact * i;

       printf("%d! = %d\n",i, fact, i);
    }
         
    printf("Fact is %d\n",fact); 
}   