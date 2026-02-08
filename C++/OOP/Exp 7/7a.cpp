#include<iostream>
using namespace std;
class College
{
    int al,ac,len,bd,side;
    public:
        void input()
        {
            cout<<"Enter length and breadth for lab:";
            cin>>len>>bd;
            area(len,bd);
            cout<<endl<<"Enter side of classroom:";
            cin>>side;
            area(side);
        }
        void area(int l,int b)
        {
            al=l*b;
        }   
        void area(int s)
        {
            ac=s*s;
        }
        void disp()
        {
            cout<<"Area of lab = "<<al;
            cout<<"Area of classroom = "<<ac;
        }
};
int main(){
    College c;
    c.input();
    c.disp();
    return 0;
}