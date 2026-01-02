#include<iostream>
using namespace std;

class Library{
    string title;
    double price;

    public:
    void input(){
        cout<<"Enter Book Title :";
        cin>>title;

        cout<<"Enter Book Price : "<<endl;
        cin>>price;
    }
    void display(){
        cout<<"\nBook Title"<<title<<endl;
        cout<<"Price"<<price<<endl;
        cout<<"*********************************************"<<endl;
    }
    double getprice(){
        return price;
    }
};
int main(){
    Library l[5];

    for (int i = 0; i < 5; i++)
    {
        cout<<"Book Number "<<i+1<<endl;
        l[i].input();
    }
     for (int i = 0; i < 5; i++)
    {
        cout<<"Book Number "<<i+1<<" Display"<<endl;
        l[i].display();
    }
    int f = 0;
    int h = l[0].getprice();
    for (int i = 0; i < 5; i++)
    {
      if (h<l[i].getprice())
      {
        h = l[i].getprice();
        f = i;
      }
      
        
    }
    cout<<"************************************************"<<endl;
    cout<<"Higest Book Price"<<endl;
    l[f].display();
    return 0;
}
