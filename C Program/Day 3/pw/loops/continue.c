#include<stdio.h>
int main(){
     int m;
     printf("Numbers are");
     for (int i = 0; i < 100; i++)
     {
        if (m%2==0)
        {
            continue;
        }
        printf("%d",i)
     }
     
}