void basicHashInsert(int arr[], int n, int hashSize) {
    std::vector<int> hashTable(hashSize, -1);

    for (int i = 0; i < n; i++) {
        int key = arr[i];
        int idx = key % hashSize;

        // Standard insertion (handling collisions via linear probing)
        int startIdx = idx;
        while (hashTable[idx] != -1) {
            idx = (idx + 1) % hashSize;
            if (idx == startIdx) break; // Table is full
        }
        hashTable[idx] = key;
    }
    
    // Output results...
}
