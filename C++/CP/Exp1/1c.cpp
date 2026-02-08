#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;

    if (n <= 0) return 0;

    vector<long long> fib;
    fib.reserve(n);   // optimization

    fib.push_back(0);
    if (n > 1)
        fib.push_back(1);

    for (int i = 2; i < n; i++) {
        fib.push_back(fib[i - 1] + fib[i - 2]);
    }

    for (long long x : fib)
        cout << x << " ";

    return 0;
}