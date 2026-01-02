#include<iostream>
using namespace std;

class triangle{
    int a;
    int b;
    int c;

    public:
    
    void calculate(){
        cout<<"enter"<<endl;
    cin>>a>>b>>c;
    if((a+b)>c&&(b+c)>a&&(a+c)>b){
            cout<<"ITS TRIANGLE"<<endl;
    }    
    else{
        cout<<"NOT";
    }
    }

};
int main(){
    triangle t;
    t.calculate();
}