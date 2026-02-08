#include<iostream>
using namespace std;
class Unary
{
    int n=10;
    public:
       Unary &operator ++()
       {
           ++n;
           return *this;
       }
       Unary operator ++(int)
       {
           Unary temp = *this;
           n++;
           return temp;
       }
       void disp()
       {
           cout<<n;
       }
};
int main()
{
    Unary n1;
    cout << "Before Increment: ";
    n1.disp();
    n1++;
    cout << "\nAfter Postfix Increment: ";
    n1.disp();
    ++n1;
    cout << "\nAfter Prefix Increment: ";
    n1.disp();
    return 0;
}