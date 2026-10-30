import java.util.Scanner;
public class LRU_PageReplacement_Exp9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of frames: ");
        int capacity = scanner.nextInt();
        System.out.print("Enter number of pages in reference string: ");
        int n = scanner.nextInt();
        int[] referenceString = new int[n];
        System.out.println("Enter the reference string elements:");
        for (int i = 0; i < n; i++) {
            referenceString[i] = scanner.nextInt();
        }
        int[] frames = new int[capacity];
        int[] recent = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            frames[i] = -1;
            recent[i] = 0;
        }
        int pageFaults = 0;
        int pageHits = 0;
        System.out.println("\nReference\tFrames\t\tStatus");
        for (int i = 0; i < n; i++) {
            int page = referenceString[i];
            boolean found = false;
            for (int j = 0; j < capacity; j++) {
                if (frames[j] == page) {
                    found = true;
                    pageHits++;
                    recent[j] = i;
                    break;
                }
            }
            if (!found) {
                int replaceIndex = -1;
                int minRecent = Integer.MAX_VALUE;
                for (int j = 0; j < capacity; j++) {
                    if (frames[j] == -1) {
                        replaceIndex = j;
                        break;
                    }
                    if (recent[j] < minRecent) {
                        minRecent = recent[j];
                        replaceIndex = j;
                    }
                }
                frames[replaceIndex] = page;
                recent[replaceIndex] = i;
                pageFaults++;
            }
            System.out.print(page + "\t\t");
            for (int j = 0; j < capacity; j++) {
                if (frames[j] != -1) {
                    System.out.print(frames[j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            if (found) {
                System.out.println("\t(Hit)");
            } else {
                System.out.println("\t(Fault)");
            }
        }
        System.out.println("\nTotal Page Faults: " + pageFaults);
        System.out.println("Total Page Hits: " + pageHits);
        scanner.close();
    }
}
