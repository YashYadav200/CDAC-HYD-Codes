#include <stdio.h>
int main()
{
    float a, b;
    int n;
    float ans;
    printf("Enter the two numbers");
    scanf("%f%f",&a,&b);
    printf(" 1:Adddition:\n");
    printf(" 2:SUBTRACTIO:\n");
    printf(" 3:mULTIPICATION:\n");
    printf(" 4:dIVISON:\n");
    scanf("%d", &n);
    switch (n)
    {
    case 1:
        ans = a + b;
        printf("Addition is %f", ans);
        break;
    case 2:
        ans = a - b;
        printf("Subtraction is %.0f", ans);
        break;
    case 3:

        ans = a * b;
        printf("Multiplication is %f\n", ans);
        break;
    case 4:

        ans = a / b;
        printf("Division  is%f \n", ans);
        break;
    default:
        break;
    }
}