#include <iostream>
#include <vector>

void linearProbing(int arr[], int n, int hashSize) {
    // Initialize hash table with -1 to represent empty slots
    std::vector<int> hashTable(hashSize, -1);

    for (int i = 0; i < n; i++) {
        int val = arr[i];
        int hashIdx = val % hashSize;

        // Linear probing to find the next available slot
        while (hashTable[hashIdx] != -1) {
            // Requirement: move to [(value + 1) % hashSize]
            hashIdx = (hashIdx + 1) % hashSize;
        }
        hashTable[hashIdx] = val;
    }

    // Display Table
    for (int i = 0; i < hashSize; i++) {
        std::cout << i << " -> " << hashTable[i] << std::endl;
    }
}
