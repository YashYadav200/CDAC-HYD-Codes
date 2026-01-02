#include <iostream>
using namespace std;

// ===== Base Class =====
class Employee {
private:
    string name;
    int empID;

protected:
    float salary;

public:
    Employee(string n, int id) {
        name = n;
        empID = id;
        salary = 0;
    }

    void displayBasic() {
        cout << "Name: " << name << "\nID: " << empID;
    }

    int getID() {
        return empID;
    }

    float getSalary() {
        return salary;
    }

    ~Employee() {
        cout << "\nEmployee with ID " << empID << " deleted.\n";
    }
};

// ===== Full-Time Employee Class =====
class FullTimeEmployee : public Employee {
    float basicPay, bonus;

public:
    FullTimeEmployee(string n, int id, float bpay, float bon)
        : Employee(n, id) {
        basicPay = bpay;
        bonus = bon;
    }

    void calculateSalary() {
        salary = basicPay + bonus;
    }

    void displayDetails() {
        cout << "\n--- Full-Time Employee ---\n";
        displayBasic();
        cout << "\nBasic Pay: " << basicPay
             << "\nBonus: " << bonus
             << "\nTotal Salary: " << salary << "\n";
    }

    ~FullTimeEmployee() {
        cout << "Full-Time Employee removed.\n";
    }
};

// ===== Part-Time Employee Class =====
class PartTimeEmployee : public Employee {
    int hoursWorked;
    float hourlyRate;

public:
    PartTimeEmployee(string n, int id, int hours, float rate)
        : Employee(n, id) {
        hoursWorked = hours;
        hourlyRate = rate;
    }

    void calculateSalary() {
        salary = hoursWorked * hourlyRate;
    }

    void displayDetails() {
        cout << "\n--- Part-Time Employee ---\n";
        displayBasic();
        cout << "\nHours Worked: " << hoursWorked
             << "\nHourly Rate: " << hourlyRate
             << "\nTotal Salary: " << salary << "\n";
    }

    ~PartTimeEmployee() {
        cout << "Part-Time Employee removed.\n";
    }
};

// ===== Main Function =====
int main() {
    Employee* emp[50]; // Array of employee pointers
    int count = 0;
    int choice;

    do {
        cout << "\n===== Employee Management Menu =====\n";
        cout << "1. Add Full-Time Employee\n";
        cout << "2. Add Part-Time Employee\n";
        cout << "3. Display All Employees\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice == 1) {
            string name;
            int id;
            float basic, bonus;

            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter ID: ";
            cin >> id;
            cout << "Enter Basic Pay: ";
            cin >> basic;
            cout << "Enter Bonus: ";
            cin >> bonus;

            FullTimeEmployee* f = new FullTimeEmployee(name, id, basic, bonus);
            f->calculateSalary();
            emp[count++] = f;
            cout << "Full-Time Employee Added!\n";
        }

        else if (choice == 2) {
            string name;
            int id, hours;
            float rate;

            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter ID: ";
            cin >> id;
            cout << "Enter Hours Worked: ";
            cin >> hours;
            cout << "Enter Hourly Rate: ";
            cin >> rate;

            PartTimeEmployee* p = new PartTimeEmployee(name, id, hours, rate);
            p->calculateSalary();
            emp[count++] = p;
            cout << "Part-Time Employee Added!\n";
        }

        else if (choice == 3) {
            cout << "\n===== Employee Details =====\n";
            for (int i = 0; i < count; i++) {
                // Try displaying both
                FullTimeEmployee* f = (FullTimeEmployee*)emp[i];
                PartTimeEmployee* p = (PartTimeEmployee*)emp[i];

                // To keep it simple, check salary type manually
                if (f->getSalary() > 0 && i % 2 == 0)
                    f->displayDetails();
                else
                    p->displayDetails();
            }
        }

        else if (choice == 4) {
            cout << "\nExiting program... Cleaning memory...\n";
            for (int i = 0; i < count; i++) {
                delete emp[i];
            }
        }

        else {
            cout << "Invalid choice!\n";
        }

    } while (choice != 4);

    return 0;
}
