#include <iostream>
using namespace std;

int main() {
    int n, rev = 0, temp;
    cout << "Enter a number: ";
    cin >> n;
    temp = n;

    while (temp > 0) {
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }

    if (n == rev) cout << n << " is Palindrome" << endl;
    else cout << n << " is Not Palindrome" << endl;

    return 0;
}
