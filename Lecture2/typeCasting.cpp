#include <iostream>
using namespace std;

int main()
{
    // conversion -> by compiler
    // casting -> by programmer

    char c = 'A'; // 65 -> ASCII Value
    int val = c;
    cout << val << endl;

    double price = 899.78;
    int newPrice = (int)price;
    cout << newPrice << endl;

    cout << (5 / (double)2) << endl;
    
    return 0;
}