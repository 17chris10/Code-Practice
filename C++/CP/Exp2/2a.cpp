#include <iostream>
using namespace std;

int main() {
    int N,n;
    cout<<"Enter a no.:";
    cin>>N;
    cout<<"Enter position of bit:";
    cin>>n;
    if(N&(1<<n))
        cout<<"Set bit"<<endl;
    else
        cout<<"Not a set bit"<<endl;
    return 0;
}
