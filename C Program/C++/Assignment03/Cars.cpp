#include<iostream>
using namespace std;

class Cars{
    string name;
    float speed;
    public:
   void setData(string n, float s){
    name = n;
    speed = s;
   }
    void display(){
        cout<<"Car Detail "<<endl;
        cout<<"Car Name : "<<name<<"\nSpeed :"<<speed <<" km/hr"<<endl;

    }
};
int main(){
    Cars c1,c2;
    c1.setData("BMW",350);
    c2.setData("Benz",400);
    c1.display();
    c2.display();
}