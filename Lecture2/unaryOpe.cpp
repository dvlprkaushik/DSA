#include<iostream>
using namespace std;

int main(){

   int a = 10;
   int b = a++; // post increment
   cout<<b<<endl;
   cout<<a<<endl; 

    int c = 10;
    int d = ++c; // pre increment
    cout<<d<<endl;
    cout<<c<<endl;
    return 0;
}