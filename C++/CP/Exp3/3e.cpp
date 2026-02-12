#include <iostream>
#include <vector>

int countSubsetsRecursive(std::vector<int>& arr, int n, int sum) {
    // If sum is 0, we found 1 way (the empty subset or successfully reached sum)
    if (sum == 0) return 1;
    
    // If no more elements are left and sum is non-zero
    if (n == 0) return 0;

    // If the current element is greater than the remaining sum, we MUST skip it
    if (arr[n - 1] > sum) {
        return countSubsetsRecursive(arr, n - 1, sum);
    }

    // Return sum of:
    // 1. Case where we include the element: arr[n-1]
    // 2. Case where we exclude the element: arr[n-1]
    return countSubsetsRecursive(arr, n - 1, sum - arr[n - 1]) + 
           countSubsetsRecursive(arr, n - 1, sum);
}

int main() {
    std::vector<int> arr = {1, 2, 3};
    int sum = 3;
    int n = arr.size();
    
    std::cout << "Count of subsets: " << countSubsetsRecursive(arr, n, sum);
    return 0;
}