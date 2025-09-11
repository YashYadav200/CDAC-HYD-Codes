#include <stdio.h>

int main()
{
    int emp_id;
    int *p = &emp_id;
    char name[30];
    char *n = name;
    char post[30];
    char dep[30];
    float salary;
    float *s = &salary;

    printf("Program Shows Details of Employees\n");

    printf("Enter the Employee Id here: ");
    scanf("%d", &emp_id);

    printf("Enter Employee Name: ");
    scanf("%s",&name);

    printf("Enter The Designation of Employee: ");
    scanf("%s", &post);

    printf("Enter The Department of Employee: ");
    scanf("%s", &dep);

    printf("Enter the Employee Salary here: ");
    scanf("%f", &salary);

    printf("\nEmployee Details Are Here:\n");
    printf("The Employee ID is: %d\n", *p);
    printf("Employee Name is: %s\n", name);
    printf("Designation of Employee is: %s\n", post);
    printf("Department of Employee is: %s\n", dep);
    printf("Employee Salary is: %.2f\n", *s);

    return 0;
}
