#include<iostream>
using namespace std;

class Bank{
    int accno;
    float balance = 0;
public:
    void deposit(double amt){
        if (amt>0)
        {
            balance += amt;
            cout<<"Amount Deposited "<<amt<<"\nAvalabil Balance "<<balance<<endl; 
        }
        else{
            cout<<"Invalid amount"<<endl;
        }
    }
    void withdraw(double amt){
        if (amt<=balance)
        {
            balance -= amt;
            cout<<"Withdraw Succes "<<amt<<"\nAvalabil Balance "<<balance<<endl;
        }
        else{
            cout<<"Insuffecent Balance"<<endl;
        }
        
    }
    void display(){
        cout<<"Avalaible Balance "<<balance<<endl;
    }
    };
    int main(){
        Bank b;
        b.deposit(10000);
        b.withdraw(10);
        b.display();
    }