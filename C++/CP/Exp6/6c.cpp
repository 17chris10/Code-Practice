#include<vector>
#include <iostream>
using namespace std;
int peak(vector<int> &arr)
{
    int s=arr.size();
    if(arr[0]>arr[1])
        return 0;
    if(arr[s-1]>arr[s-2])
        return s-1;
    int l=1, h=s-2;
    while(l<=h){
        int mid=(l+h)/2;
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            return mid;
        else if (arr[mid]<arr[mid+1])
            l=mid+1;
        else
            h=mid-1;
    }
    return 0;
}
int main()
{
    vector<int> arr = {1, 2, 4, 5, 7, 8, 3};
    cout << peak(arr);
    return 0;
}
