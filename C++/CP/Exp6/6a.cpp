#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int search(const vector<int>& arr, int l, int h, int t, int c) {
    if (l > h) {
        return c;
    }
    int mid = l + (h - l) / 2;
    if (arr[mid] == t) {
        cout << "Found " << t << " at index " << mid << ". Tripling to " << t * 3 << "..." << endl;
        return search(arr, 0, arr.size() - 1, t * 3, c + 1);
    }
    if (arr[mid] > t) {
        return search(arr, l, mid - 1, t, c);
    } else {
        return search(arr, mid + 1, h, t, c);
    }
}
int main() {
    vector<int> data = {2, 5, 6, 12, 18, 23, 54, 72, 162};
    int it = 2;
    int total = search(data, 0, data.size() - 1, it, 0);
    cout<< "\nTotal successful occurrences found: " << total << endl;
    return 0;
}