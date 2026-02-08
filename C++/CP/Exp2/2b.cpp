#include <bits/stdc++.h>
using namespace std;

int maxAND(vector<int> arr) {
    int result = 0;
    vector<int> candidates = arr;

    // Check bits from 31 down to 0
    for (int bit = 31; bit >= 0; --bit) {
        vector<int> tempCandidates;
        int mask = result | (1 << bit);

        // Keep only numbers that have this bit set
        for (int num : candidates) {
            if ((num & mask) == mask) {
                tempCandidates.push_back(num);
            }
        }

        // If at least two numbers have this bit set, include it
        if (tempCandidates.size() >= 2) {
            result |= (1 << bit);
            candidates = tempCandidates; // Narrow down candidates
        }
    }

    return result;
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; ++i) cin >> arr[i];

    cout << maxAND(arr) << endl;
    return 0;
}
