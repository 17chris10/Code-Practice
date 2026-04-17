#include <iostream>
#include <list>

class MyStack {
private:
    std::list<int> data;

public:
    // Pushes an element onto the stack (top is the end of the list)
    void push(int value) {
        data.push_back(value);
    }

    // Removes the top element
    void pop() {
        if (!data.empty()) {
            data.pop_back();
        } else {
            std::cout << "Stack is empty!" << std::endl;
        }
    }

    // Returns the top element
    int top() {
        return data.back();
    }

    bool isEmpty() {
        return data.empty();
    }
};

int main() {
    MyStack s;
    s.push(10);
    s.push(20);
    std::cout << "Top element: " << s.top() << std::endl; // Output: 20
    s.pop();
    std::cout << "Top after pop: " << s.top() << std::endl; // Output: 10
    return 0;
}
