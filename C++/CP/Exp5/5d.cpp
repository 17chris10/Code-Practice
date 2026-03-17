void oppositePositionHashing(int arr[], int n, int hashSize) {
    std::vector<int> hashTable(hashSize, -1);

    for (int i = 0; i < n; i++) {
        int val = arr[i];
        int initialIdx = val % hashSize;

        // If slot is empty OR contains the exact same value (identical items)
        if (hashTable[initialIdx] == -1 || hashTable[initialIdx] == val) {
            hashTable[initialIdx] = val;
        } 
        else {
            // Colliding elements move to the "opposite" formula position
            int altIdx = (val + 1) % hashSize;
            
            // Basic collision handling for the alternative slot
            while (hashTable[altIdx] != -1 && hashTable[altIdx] != val) {
                altIdx = (altIdx + 1) % hashSize;
            }
            hashTable[altIdx] = val;
        }
    }
}
