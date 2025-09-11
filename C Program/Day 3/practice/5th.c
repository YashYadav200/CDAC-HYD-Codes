#include <stdio.h>
int main()
{
    int r, c;

    printf("Enter number of rors\n");
    scanf("%d", &r);
    printf("Enter number of colums\n");
    scanf("%d", &c);
    int a[r][c];
    printf("Enter they element \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("Array is \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d  ", a[i][j]);
        }
        printf("\n");
    }
    printf("Transpose Array is \n");
    for (int i = 0; i < c; i++)
    {
        for (int j = 0; j < r; j++)
        {
            printf("%d  ", a[j][i]);
        }
        printf("\n");
    }

    int sum[r][c];
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d  ", a[i][j]);
            sum[i][j] = a[i][j] + a[i][j];
        }
        printf("\n");
    }
    printf("Addition Array is \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d  ", sum[i][j]);
        }
        printf("\n");
    }
}