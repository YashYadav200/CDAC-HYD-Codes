#include <iostream>
using namespace std;

class Employees{
    int id;
    string name;
    double salary;
    public:
    Employees(int Id, string n, double s){
        id = Id;
        name = n;
        salary =s;
    }
    void display(){
        cout<<"Employees Details"<<endl;
        cout<<"Employee ID : "<<id<<"\nEmployee Name : "<<name<<"\nSalary : "<<salary<<endl;
    }
};
int main(){
    Employees e(1001,"Yash",100000);
    e.display();
}