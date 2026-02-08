#include <iostream>
using namespace std;
template <class T> class Calculator
{
    public:
        T n1=5, n2=6;
        void add()
        {
            cout<<"Sum = "<<(n1+n2)<<endl;
        }
        void diff()
        {
            cout<<"Difference = "<<(n1-n2)<<endl;
        }
        void prod()
        {
            cout<<"Product = "<<(n1*n2)<<endl;
        }
        void divs()
        {
            cout<<"Quotient = "<<(n1/n2)<<endl;
            cout<<"Remainder = "<<(n1%n2)<<endl;
        }
        void disp()
        {
            add();
            diff();
            prod();
            divs();
        }
};
int main()
{
    Calculator<int>c;
    c.disp();
    return 0;
}
