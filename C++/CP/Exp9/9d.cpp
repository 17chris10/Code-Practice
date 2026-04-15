#include <iostream>
#include <stack>
#include <vector>
#include <cmath>
using namespace std;

int floorDiv(int a, int b) {
    if (a * b < 0 && a % b != 0)
        return (a / b) - 1;
    return a / b;
}

int evaluate(vector<string>& arr) {
    stack<int> st;
    for (string t : arr) {
        if (isdigit(t[0]) || (t.size() > 1 && t[0] == '-')) {
            st.push(stoi(t));
        } 
        else {
            int val1 = st.top(); st.pop(); 
            int val2 = st.top(); st.pop(); 

            if (t == "+") st.push(val2 + val1);
            else if (t == "-") st.push(val2 - val1);
            else if (t == "*") st.push(val2 * val1);
            else if (t == "/") st.push(floorDiv(val2, val1));
            else if (t == "^") st.push((int)pow(val2, val1));
        }
    }
    return st.top();
}

int main() {
    vector<string> arr = {"2", "3", "1", "*", "+", "9", "-"}; 
    cout << evaluate(arr) << endl;
    return 0;
}
