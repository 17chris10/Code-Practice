#include <iostream>
using namespace std;

int main() {
    int N,n;
    cout<<"Enter a no.:";
    cin>>N;
    if(N&1)
        cout<<"odd"<<endl;
    else
        cout<<"even"<<endl;
    return 0;
}
