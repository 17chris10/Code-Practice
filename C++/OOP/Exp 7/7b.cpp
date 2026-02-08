#include<iostream>
using namespace std;
class Hello
{
    int s1=0,in[10],i;
    float s2=0.0f,fl[5];
    public:
        void input()
        {
            cout<<"Enter 10 integer values:";
            for(i=0;i<10;i++)
                cin>>in[i];
            sum(in);
            cout<<endl<<"Enter 5 decimal values:";
            for(i=0;i<5;i++)
                cin>>fl[i];
            sum(fl);
        }
        void sum(int in[10])
        {
            for(i=0;i<10;i++)
                s1+=in[i];
        }
        void sum(float fl[5])
        {
            for(i=0;i<5;i++)
                s2+=fl[i];
        }
        void disp()
        {
            cout<<"Sum of float values = "<<s2<<endl;
            cout<<"Sum of integer values = "<<s1<<endl;
        }
};
int main()
{
    Hello h;
    h.input();
    h.disp();
    return 0;
}