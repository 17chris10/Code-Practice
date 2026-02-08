#include <iostream>
using namespace std;

// Function template definition
template <typename T> T SUM(T a[], T s)
{
    T total=0;
    int i;
    for(i=0;i<s;i++)
        total+=a[i];
    return total;
}

int main()
{
    int arr[]={1,2,3,4,5};
    // Call myMax for int
    cout << "Sum = "<<SUM<int>(arr, 5) << endl;
    return 0;
}