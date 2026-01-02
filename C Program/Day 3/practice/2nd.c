#include<stdio.h>
int main(){
    float a,b;
    int n;
    int sum;
    printf("Enter the two numbers");
    scanf("%d\n %d\n");
    printf(" 1:Adddition:\n");
    printf(" 2:SUBTRACTIO:\n");
    printf(" 3:mULTIPICATION:\n");
    printf(" 4:dIVISON:\n");
    switch (n)
    {
    case 1:
        int sum = 0;
        sum = a+b;
        printf("Addition is %.0f",sum);
        break;
    case 2:
        int sub=0; 
        sub = a-b;
        printf("Subtraction is %.0f",sub);
        break;
    case 3:
        int mul= 1;
        mul = a*b;
        printf("Multiplication is \n %.0f",mul);
        break;
    case 4:
        float div;
        if(b=0){
            printf("Put valid input");
        }
        else
        div = a/b;
        printf("Division  is \n",div);
        break;
    default:
        printf("Wrong sselection");
        break;
    }
}