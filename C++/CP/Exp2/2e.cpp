#include <iostream>
#include <cmath> // Required for log10

int main() {
    int n;
    std::cin >> n;
    
    // log10(12345) is approximately 4.091
    // floor(4.091) is 4
    // 4 + 1 = 5 digits
    int digits = (n == 0) ? 1 : floor(log10(abs(n))) + 1;
    
    std::cout << "Number of digits: " << digits << std::endl;
    return 0;
}