#include<iostream>
using namespace std;

class Practice02{
    int ratio1;
    int ratio2;

    int year1;
    int ratio3;
    int ratio4;
    double fatherAge;
    do sonAge;
    public:
// The ratio of the ages of a father and his son is 5 : 2.
// After 10 years, the ratio of their ages will be 7 : 3.
// Find the present ages of the father and the son.
    void input(){
        cout<<"Enter 2 ratio of ages "<<endl;
        cin>>ratio1>>ratio2;
        cout<<"Enter after how many years ratio want"<<endl;
        cin>>year1;
        cout<<"Enter ratio after "<<year1<<"years";
        cin>>ratio3>>ratio4;
    }
    void equation1(){
                // x = (c*n - d*n)/(d*a - c*b)
 double x = year1 * double(ratio3 - ratio4) / double(ratio4*ratio1 - ratio3*ratio2);
      
        fatherAge = ratio1 * x;
        sonAge = ratio2 * x;
    }
     void display() {
        cout << "Present age of Father: " << fatherAge << " years" << endl;
        cout << "Present age of Son: " << sonAge << " years" << endl;
    }
};
int main() {
    Practice02 p;
    p.input();
    p.equation1();
    p.display();
    return 0;
}
