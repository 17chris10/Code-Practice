#include <iostream>
#include <list>
using namespace std;
class MyStack {
private:
    list<int> data;

public:
    void push(int value) {
        data.push_back(value);
    }
    void pop() {
        if (!data.empty()) {
            data.pop_back();
        } else {
            cout << "Stack is empty!" << std::endl;
        }
    }
    int top() {
        return data.back();
    }

    bool isEmpty() {
        return data.empty();
    }
    void display() {
        for (int value : data) {
            cout << value << " ";
        }
        cout << endl;
    }
};

int main() {
    MyStack s;
    s.push(10);
    s.push(20);
    cout<<"Current Stack: ";
    s.display();
    cout << "Top element: " << s.top() << endl; 
    s.pop();
    cout << "Top after pop: " << s.top() << endl; 
    return 0;
}
