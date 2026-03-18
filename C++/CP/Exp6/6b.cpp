#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int search(const vector<int>& arr, int t) {
    int l = 0, h = arr.size() - 1;
    int idx = -1; // Stores the "latest" best find

    while (l <= h) {
        int mid = l + (h - l) / 2;

        if (arr[mid] == t) {
            idx = mid;       // Found it! But...
            h = mid - 1;     // ...look further left for an earlier one.
        } 
        else if (arr[mid] > t) h = mid - 1;
        else l = mid + 1;
    }
    return idx;
}
int main() {
    vector<int> data = {2, 5, 1, 4, 6, 2, 9, 3};
    sort(data.begin(), data.end());
    cout<<"After sorting:"<<endl;
    for(int i: data)
        cout<<i<<" ";
    int t=2;
    int idx = search(data, t);
    cout<< "\nIndex of 1st occurence of "<<t<<" = "<< idx << endl;
    return 0;
}
