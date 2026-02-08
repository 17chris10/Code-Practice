#include <iostream>
#include <cmath> // Required for log10
using namespace std;
int sumOfDigits(int num)
{
    if(num==0)
        return 0;
    return (num%10)+sumOfDigits(num/10);
}
int main() {
    int i,n,sum;
    cout<<"Enter a no.:";
    cin>>n;
    sum=sumOfDigits(n);
    cout<<"Sum = "<<sum<<endl;
    return 0;
}