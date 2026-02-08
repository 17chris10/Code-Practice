#include <iostream>
#include <vector>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;

    vector<vector<int>> matrix(r, vector<int>(c));
    vector<vector<int>> transpose(c, vector<int>(r));

    // Input matrix
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cin >> matrix[i][j];
        }
    }

    // Transpose logic
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }

    // Output transposed matrix
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            cout << transpose[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
