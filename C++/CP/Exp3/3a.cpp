#include <iostream>
#include <cmath> // Required for log10
using namespace std;
void disp(int num)
{
    if(num<1)
        return;
    cout<<num<<endl;
    return disp(num-1);
}
int main() {
    int i,n;
    cout<<"Enter a no.:";
    cin>>n;
    disp(n);
    return 0;
}