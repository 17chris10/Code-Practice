#include<iostream>
using namespace std;
class Unary
{
    int n=0;
    public:
        void input()
        {
            cout<<"Enter a no.:";
            cin>>n;
        }
        void operator -()
        {
            n=-n;
        }
        void disp()
        {
            cout<<"n = "<<n<<endl;
        }
};
int main()
{
    Unary u;
    u.input();
    -u;
    u.disp();
    return 0;
}