#include <iostream>
using namespace std;

int main()
{
    cout << "Hello CPP to continue \n Data Structures" << endl;
    // To compile this code --> g++ code.cpp
    // To run this code --> ./code
    int age = 25;
    cout << "Size of = " << sizeof(age) << endl;
    char c = 'C';
    cout << "Size of = " << sizeof(c) << endl;
    float PI = 100.78f;
    cout << "Size of = " << sizeof(PI) << endl;
    bool isCorrect = true;
    cout << "Size of = " << sizeof(isCorrect) << endl;
    double value = 34.67;
    cout << "Size of = " << sizeof(value) << endl;
    return 0;
}