#include <iostream>
using namespace std;

class Students
{
    string name;
    int roll_no;
    float mark;

public:
    void input()
    {
        cout << "Enter Students Details : " << endl;
        cout << "Enter Name" << endl;
        // getline(cin, name);
        cin >> name;
        cout << "Enter Roll Number : " << endl;
        cin >> roll_no;
        cout << "Enter Marks :" << endl;
        cin >> mark;
    }
    void display()
    {
        cout << "Name : " << name << "\nRoll_No : " << roll_no << "\nMarks : " << mark << endl;
        cout << "\n************************************************" << endl;
    }
};
int main()
{
    Students s[3];
    for (int i = 0; i < 3; i++)
    {
        cout << "Student Details Are " << endl;
        s[i].input();
    }
    for (int i = 0; i < 3; i++)
    {
        s[i].display();
    }
}