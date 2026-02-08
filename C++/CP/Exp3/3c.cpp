#include <iostream>
using namespace std;

// Function to calculate n raised to power m
int power(int n, int m) {
    // Base Case: Any number raised to 0 is 1
    if (m == 0) {
        return 1;
    }
    // Recursive Step: n * n^(m-1)
    return n * power(n, m - 1);
}

int main() {
    int n, m, result;
    cout << "Enter the base (n) and the exponent (m): ";
    cin >> n >> m;

    result = power(n, m);
    
    cout << n << " raised to " << m << " = " << result << endl;
    return 0;
}