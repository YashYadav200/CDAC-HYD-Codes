#include <iostream>
using namespace std;

class PRACTICE
{
    float cp;
    float sp;
    float l;
    float p;

public:
    void input()
    {
        cout << "Enter Cost Price : " << endl;
        cin >> cp;
        cout << "Enter Selling Price : " << endl;
        cin >> sp;
    }
    void check()
    {
        if (cp > sp)
        {
            l = cp - sp; //(Loss / Cost Price) × 100%

            cout << l << " Rs" << " : Loss" << endl;
        }

        if (cp < sp)
        {
            p = sp - cp; //(Profit / Cost Price) × 100%
            cout << p << " Rs" << " : PROFIT" << endl;
        }
    }
    float costprice()
    {
        return cp;
    }
    float sellingprice()
    {
        return sp;
    }
    float getloss()
    {
        return l;
    }
    float getprofit()
    {
        return p;
    }
};
class Percentage : public PRACTICE
{
    float lper;
    float pper;

public:
    void appti()
    {
        if (getprofit() > getloss())
        {
            pper = (getprofit() / costprice()) * 100;
            cout << "Profit Percentage is : " << pper <<"%"<< endl;
        }
        else if (getloss() > getprofit())
        {
            lper = (getloss() / costprice()) * 100;
            cout << "Loss Percentage is : " << lper <<"%"<< endl;
        }
    }
};
int main()
{
    Percentage p1;
    p1.input();
    p1.check();
    p1.appti();
    return 0;
}