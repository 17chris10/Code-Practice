#include <iostream>
using namespace std;

class Stack {
    int *arr, size, top;        

public:
    Stack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }
    void push(int x) {
        if (top == size - 1) {
            cout << "Stack Overflow\n";
            return;
        }
        arr[++top] = x;
    }
    int pop() {
        if (top == -1) {
            cout << "Stack Underflow\n";
            return -1;
        }
        return arr[top--];
    }
    bool isEmpty() {
        return top == -1;
    }
    bool isFull() {
        return top == size - 1;
    }
    void disp(){
        for (int i = 0; i <= top; i++)
            cout << arr[i] << " ";
    }
};
int main() {
    Stack st(4);
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    cout << "Popped: " << st.pop() << "\n";
    st.disp();
    return 0;
}
