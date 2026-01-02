#include <iostream>
using namespace std;

class Complex{
    float real,imag;

    public:
    Complex(float r =0, float i = 0){
     real = r;
        imag = i;
    }

    Complex add(Complex c2){
       Complex result;
       result.real = real + c2.real;
       result.imag = imag + c2.imag;
       return result;

    }
    void display(){
        cout<< real<<" + "<< imag <<"i"<<endl;
    }
};
int main(){
    Complex c1(5.2, 3.4);
    Complex c2(2.8, 4.6);
    Complex sum = c1.add(c2);
    cout<<"first";
    c1.display();
    cout<<"second";
    c2.display();
    return 0;
    
}