#include <stdio.h>
int main() {
    int reference_string[] = {7, 0, 1, 2, 0, 3, 0, 4};
    int n = sizeof(reference_string) / sizeof(reference_string[0]);
    int frames = 3;
    int mem[3];
    int page_faults = 0, page_hits = 0;
    int pointer = 0;
    int i, j, flag;
    for (i = 0; i < frames; i++) {
        mem[i] = -1; // Initialize frames as empty
    }
    printf("\nReference\tFrames\n");
    for (i = 0; i < n; i++) {
        int page = reference_string[i];
        flag = 0;
        // Check for page hit
        for (j = 0; j < frames; j++) {
            if (mem[j] == page) {
                flag = 1;
                page_hits++;
                break;
            }
        }
        // If page fault occurs
        if (flag == 0) {
            mem[pointer] = page;
            pointer = (pointer + 1) % frames;
            page_faults++;
        }
        printf("%d\t\t", page);
        for (j = 0; j < frames; j++) {
            if (mem[j] != -1)
                printf("%d ", mem[j]);
            else
                printf("- ");
        }
        if (flag == 1)
            printf("(Hit)\n");
        else
            printf("(Fault)\n");
    }
    printf("\nTotal Page Faults: %d", page_faults);
    printf("\nTotal Page Hits: %d\n", page_hits);
    return 0;
}
