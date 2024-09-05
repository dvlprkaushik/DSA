// calculator program -->

#include <iostream>
using namespace std;

int main()
{
    int a, b;
    cout << "Enter value of a = ";
    cin >> a;
    cout << "Enter value of b = ";
    cin >> b;
    char symbol;
    cout << "Enter the operation you want to perform - [ + , - , / , x , % ] : ";
    cin >> symbol;
    if (symbol == '+')
    {
        cout << " sum is : " << a + b << endl;
    }
    else if (symbol == '-')
    {
        cout << " subtraction is : " << a - b << endl;
    }
    else if (symbol == '*')
    {
        cout << " Product is : " << a * b << endl;
    }
    else if (symbol == '/')
    {
        cout << " Division is : " << (float)a / (float)b << endl;
    }
    else if (symbol == '%')
    {
        cout << " Remainder is : " << (float)(a % b) << endl;
    }
    return 0;
}