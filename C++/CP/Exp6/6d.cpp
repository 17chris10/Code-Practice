#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void twoSum(vector<int> &arr, int t){
    sort(arr.begin(), arr.end());
    int l = 0, r = arr.size() - 1;
    while (l < r){
        int sum = arr[l] + arr[r];
        if (sum == t){
            cout<<arr[l]<<endl<<arr[r];
            return;
        }
        else if (sum < t)
            l++; 
        else
            r--; 
    }
}

int main(){
    vector<int> arr = {0, -1, 2, -3, 1};
    int t = -2;
    twoSum(arr, t);
    return 0;
}
