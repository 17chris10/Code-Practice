#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n == 0 || n == 1) {
        cout << 1;
        return 0;
    }

    double c = 0;
    for (int i = 2; i <= n; i++)
        c += log10(i);

    int digits = (int)c + 1;
    cout << digits;
}
