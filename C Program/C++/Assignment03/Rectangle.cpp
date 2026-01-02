#include <iostream>
using namespace std;

class Rectangle
{
    float length;
    float breadth;

public:
    void input()
    {
        cout << "Enter the Parameter to Calculate Area & Perimeter " << endl;
        cin >> length >> breadth;
    }
    void perimeter()
    {
        float p = 2 * (length + breadth);
        cout << "Perimeter of Rectangle " << 2 * (length + breadth) << endl;
    }
    void area()
    {
        float a = length * breadth;
        cout << "Rectangle Area " << length * breadth << endl;
    }
};
int main()
{
    Rectangle r;
    r.input();
    r.perimeter();
    r.area();
}