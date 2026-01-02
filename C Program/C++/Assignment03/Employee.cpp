// 2.Title: Employee Payroll Management System (with Dynamic Bonus Calculation) Problem
// Statement: Design a C++ program to manage employees of a company. Each employee has
// common details (name, ID, base salary), but different roles (e.g., Manager, Developer) that
// determine their bonus. You must use classes, inheritance, encapsulation, constructors,
// destructors, and pointers to: ● Store and display employee information. ● Dynamically allocate
// memory for employees. ● ● Compute their total salary (base + bonus). Ensure proper cleanup of
// allocated memory. Requirements:
// 1. Base Class: Employee ○ Private Data Members: ■ string name ■ int id ○ ■ float
// baseSalary Protected Member: ■ float bonus ○ Public Functions: ■ Parameterized
// Constructor to initialize name, id, salary. ■ virtual void calculateBonus() → base version
// sets bonus = 0. ■ virtual void display() → prints employee details. ■ Virtual Destructor
// (for safe cleanup).
// 2. Derived Class: Manager (inherits from Employee) ○ Overrides calculateBonus() →
// bonus = 40% of baseSalary. ○ Overrides display() → shows “Manager” and total salary.
// 3. Derived Class: Developer (inherits from Employee) ○ Overrides calculateBonus() →
// bonus = 25% of baseSalary. ○ Overrides display() → shows “Developer” and total salary.
// 4. Main Function Logic:
// 5.  Ask user how many employees to create. Dynamically create an array of Employee*
// pointers (using new). Let the user choose the type (Manager or Developer) for each. Use
// runtime polymorphism (Employee* e = new Manager(...)) to store objects. Call
// calculateBonus() and display() for each employee. Finally, delete all dynamically
// allocated objects safely.
#include <iostream>
using namespace std;

class Employee
{
   protected: 
    string name;
    int id;
    float baseSalary;

protected:
    float bonus;

public:
     Employee(string n, int ID, float bs)
    {
        name = n;
        id = ID;
        baseSalary = bs;
        
    }
    virtual void input()
    {
        cout << "Enter Employee Name: ";
        cin >> name;
        cout << "Enter id" << endl;
        cin >> id;
        cout << "Enter Base Salary: ";
        cin >> baseSalary;
    }
    float getbaseSalary()
    {
        return baseSalary;
    }
    float getSalary()
    {
        return baseSalary;
    }

    virtual void calculateBonuce()
    {
        bonus = 0;
    }
    virtual void display()
    {
        cout << "Emp Name : " << name << "Emp ID : " << id << "Base Salary : " << baseSalary << endl;
        cout << "Total Salary: " << baseSalary + bonus << endl;
    }
    ~Employee()
    {
        cout << " Destructor called for Employee ID: " << id << endl;
    }
};
class Manager : public Employee
{
public:
    Manager(string n1, int ID1, float bs1, float bonus1) : Employee(n1, ID1, bs1) {}
    
    void calculateBonuce() override
    {
        bonus = 0.4f * getbaseSalary();
    }
    void display() override
    {
        cout << "Emp Name : " << name << "Emp ID : " << id << "Base Salary : " << baseSalary << endl;
        cout << "Total Salary: " << baseSalary + bonus << endl;
    }
};

class Devloper : public Employee
{
public:
    Devloper(string n1, int ID1, float bs1, float bonus1) : Employee(n1, ID1, bs1) {}
    void calculateBonuce() override
    {
        bonus = 0.25f * getbaseSalary();
    }
    void display() override
    {
        cout << "Emp Name : " << name << "Emp ID : " << id << "Base Salary : " << baseSalary << endl;
        cout << "Total Salary: " << baseSalary + bonus << endl;
    }
};
int main()
{
    int n;
    cout << "Enter Number of Employess" << endl;
    cin >> n;
    Employee **emparr = new Employee *[n];
    for (int i = 0; i < n; i++){
    string name;
    int id;
    float baseSalary;
    float bonus;
    cout << "Enter Employee Name: ";
    cin >> name;
    cout << "Enter id" << endl;
    cin >> id;
    cout << "Enter Base Salary: ";
    cin >> baseSalary;
    cout << "Enter Bonuce : ";
    cin >> bonus;

        int choice;
        cout << "Enter Choice" << endl;
        cin >> choice;
        if (choice == 1)
        {
            emparr[i] = new Manager(name, id, baseSalary, bonus);
        }
        else
        {
            emparr[i] = new Devloper(name, id, baseSalary, bonus);
        }
        
        emparr[i]->calculateBonuce();
    }
    for (int i = 0; i < n; i++)
    {
        emparr[i]->display();
    }
    for (int i = 0; i < n; i++)
    {
        delete emparr[i];
    }
    delete[] emparr;
}