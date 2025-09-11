#include<stdio.h>
int fact(int);
int main(){
    int a;
    printf("Enter they number\n");
    scanf("%d",&a);
    int fac = fact(a);
    printf("Factorial of %d is %d ",a,fac);
}
int fact (int n){
    
    if(n==1|| n==0){
     return 1;
    }
    else{
        return  n* fact (n-1);
    }
    return 0;
}