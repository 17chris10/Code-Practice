#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int main() {
    string s;
    int count = 0;

    getline(cin, s);   // read full line

    stringstream ss(s);
    string word;

    while (ss >> word) {
        count++;
    }

    cout << count;

    return 0;
}
