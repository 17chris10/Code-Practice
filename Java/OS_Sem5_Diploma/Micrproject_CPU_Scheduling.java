import java.util.Scanner;

class Process {
    int pid;
    int at; // Arrival Time
    int bt; // Burst Time
    int rt; // Remaining Time (for preemptive algorithms)
    int priority;
    int ct; // Completion Time
    int tat; // Turnaround Time
    int wt; // Waiting Time

    public Process(int pid, int at, int bt, int priority) {
        this.pid = pid;
        this.at = at;
        this.bt = bt;
        this.rt = bt;
        this.priority = priority;
    }
}

public class Micrproject_CPU_Scheduling {

    public static void printTable(Process[] p) {
        System.out.println("\nPID\tArrival\tBurst\tPriority\tCompletion\tTurnaround\tWaiting");
        System.out.println("--------------------------------------------------------------------------");
        double totalWt = 0, totalTat = 0;
        for (Process proc : p) {
            totalWt += proc.wt;
            totalTat += proc.tat;
            System.out.println(proc.pid + "\t" + proc.at + "\t" + proc.bt + "\t" + proc.priority + "\t\t" + 
                               proc.ct + "\t\t" + proc.tat + "\t\t" + proc.wt);
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("Average Waiting Time: %.2f\n", (totalWt / p.length));
        System.out.printf("Average Turnaround Time: %.2f\n", (totalTat / p.length));
    }

    // 1. FCFS (First Come First Serve)
    public static void fcfs(Process[] original) {
        Process[] p = cloneProcesses(original);
        // Sort by Arrival Time
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                if (p[j].at > p[j + 1].at) {
                    Process temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        int currentTime = 0;
        for (int i = 0; i < p.length; i++) {
            if (currentTime < p[i].at) {
                currentTime = p[i].at;
            }
            currentTime += p[i].bt;
            p[i].ct = currentTime;
            p[i].tat = p[i].ct - p[i].at;
            p[i].wt = p[i].tat - p[i].bt;
        }
        printTable(p);
    }

    // 2. SJF Non-Preemptive
    public static void sjfNonPreemptive(Process[] original) {
        Process[] p = cloneProcesses(original);
        int n = p.length;
        boolean[] completed = new boolean[n];
        int currentTime = 0, count = 0;

        while (count < n) {
            int minBt = Integer.MAX_VALUE;
            int shortest = -1;

            for (int i = 0; i < n; i++) {
                if (!completed[i] && p[i].at <= currentTime && p[i].bt < minBt) {
                    minBt = p[i].bt;
                    shortest = i;
                }
            }

            if (shortest == -1) {
                currentTime++;
            } else {
                currentTime += p[shortest].bt;
                p[shortest].ct = currentTime;
                p[shortest].tat = p[shortest].ct - p[shortest].at;
                p[shortest].wt = p[shortest].tat - p[shortest].bt;
                completed[shortest] = true;
                count++;
            }
        }
        printTable(p);
    }

    // 3. SRTF (Shortest Remaining Time First - Preemptive SJF)
    public static void srtf(Process[] original) {
        Process[] p = cloneProcesses(original);
        int n = p.length;
        int completed = 0, currentTime = 0;

        while (completed < n) {
            int minRt = Integer.MAX_VALUE;
            int shortest = -1;

            for (int i = 0; i < n; i++) {
                if (p[i].at <= currentTime && p[i].rt > 0 && p[i].rt < minRt) {
                    minRt = p[i].rt;
                    shortest = i;
                }
            }

            if (shortest == -1) {
                currentTime++;
            } else {
                p[shortest].rt--;
                currentTime++;

                if (p[shortest].rt == 0) {
                    completed++;
                    p[shortest].ct = currentTime;
                    p[shortest].tat = p[shortest].ct - p[shortest].at;
                    p[shortest].wt = p[shortest].tat - p[shortest].bt;
                }
            }
        }
        printTable(p);
    }

    // 4. Round Robin
    public static void roundRobin(Process[] original, int tq) {
        Process[] p = cloneProcesses(original);
        int n = p.length;
        int currentTime = 0, completed = 0;
        int[] queue = new int[100];
        int front = 0, rear = 0;
        boolean[] inQueue = new boolean[n];

        // Sort by arrival time to queue up initial processes
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (p[j].at > p[j + 1].at) {
                    Process temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        queue[rear++] = 0;
        inQueue[0] = true;
        currentTime = p[0].at;

        while (front < rear) {
            int idx = queue[front++];

            if (p[idx].rt > tq) {
                currentTime += tq;
                p[idx].rt -= tq;
            } else {
                currentTime += p[idx].rt;
                p[idx].rt = 0;
                p[idx].ct = currentTime;
                p[idx].tat = p[idx].ct - p[idx].at;
                p[idx].wt = p[idx].tat - p[idx].bt;
                completed++;
            }

            // Check for newly arrived processes and add them to the queue
            for (int i = 0; i < n; i++) {
                if (p[i].at <= currentTime && p[i].rt > 0 && !inQueue[i]) {
                    queue[rear++] = i;
                    inQueue[i] = true;
                }
            }

            // If current process is not finished, re-add it to the queue
            if (p[idx].rt > 0) {
                queue[rear++] = idx;
            } else if (front < rear && currentTime < p[queue[front]].at) {
                // If queue is empty temporarily, jump time to next process arrival
                currentTime = p[queue[front]].at;
                for (int i = 0; i < n; i++) {
                    if (p[i].at <= currentTime && p[i].rt > 0 && !inQueue[i]) {
                        queue[rear++] = i;
                        inQueue[i] = true;
                    }
                }
            }
        }
        printTable(p);
    }

    // 5. Priority Non-Preemptive
    public static void priorityNonPreemptive(Process[] original) {
        Process[] p = cloneProcesses(original);
        int n = p.length;
        boolean[] completed = new boolean[n];
        int currentTime = 0, count = 0;

        while (count < n) {
            int highestPriority = Integer.MAX_VALUE;
            int selected = -1;

            for (int i = 0; i < n; i++) {
                if (!completed[i] && p[i].at <= currentTime && p[i].priority < highestPriority) {
                    highestPriority = p[i].priority;
                    selected = i;
                }
            }

            if (selected == -1) {
                currentTime++;
            } else {
                currentTime += p[selected].bt;
                p[selected].ct = currentTime;
                p[selected].tat = p[selected].ct - p[selected].at;
                p[selected].wt = p[selected].tat - p[selected].bt;
                completed[selected] = true;
                count++;
            }
        }
        printTable(p);
    }

    // 6. Priority Preemptive
    public static void priorityPreemptive(Process[] original) {
        Process[] p = cloneProcesses(original);
        int n = p.length;
        int completed = 0, currentTime = 0;

        while (completed < n) {
            int highestPriority = Integer.MAX_VALUE;
            int selected = -1;

            for (int i = 0; i < n; i++) {
                if (p[i].at <= currentTime && p[i].rt > 0 && p[i].priority < highestPriority) {
                    highestPriority = p[i].priority;
                    selected = i;
                }
            }

            if (selected == -1) {
                currentTime++;
            } else {
                p[selected].rt--;
                currentTime++;

                if (p[selected].rt == 0) {
                    completed++;
                    p[selected].ct = currentTime;
                    p[selected].tat = p[selected].ct - p[selected].at;
                    p[selected].wt = p[selected].tat - p[selected].bt;
                }
            }
        }
        printTable(p);
    }

    // Helper method to clone process array so data isn't modified across algorithm selections
    public static Process[] cloneProcesses(Process[] original) {
        Process[] clone = new Process[original.length];
        for (int i = 0; i < original.length; i++) {
            clone[i] = new Process(original[i].pid, original[i].at, original[i].bt, original[i].priority);
        }
        return clone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProcess " + (i + 1) + ":");
            System.out.print("Enter Arrival Time: ");
            int at = scanner.nextInt();
            System.out.print("Enter Burst Time: ");
            int bt = scanner.nextInt();
            System.out.print("Enter Priority (lower number = higher priority): ");
            int priority = scanner.nextInt();
            processes[i] = new Process(i + 1, at, bt, priority);
        }

        int choice;
        do {
            System.out.println("\n======================================");
            System.out.println("       CPU SCHEDULING ALGORITHMS      ");
            System.out.println("======================================");
            System.out.println("1. FCFS (First Come First Serve)");
            System.out.println("2. SJF (Non-Preemptive)");
            System.out.println("3. SRTF (Preemptive SJF)");
            System.out.println("4. Round Robin (RR)");
            System.out.println("5. Priority (Non-Preemptive)");
            System.out.println("6. Priority (Preemptive)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- FCFS Scheduling ---");
                    fcfs(processes);
                    break;
                case 2:
                    System.out.println("\n--- SJF (Non-Preemptive) Scheduling ---");
                    sjfNonPreemptive(processes);
                    break;
                case 3:
                    System.out.println("\n--- SRTF (Preemptive SJF) Scheduling ---");
                    srtf(processes);
                    break;
                case 4:
                    System.out.print("Enter Time Quantum for Round Robin: ");
                    int tq = scanner.nextInt();
                    System.out.println("\n--- Round Robin Scheduling ---");
                    roundRobin(processes, tq);
                    break;
                case 5:
                    System.out.println("\n--- Priority (Non-Preemptive) Scheduling ---");
                    priorityNonPreemptive(processes);
                    break;
                case 6:
                    System.out.println("\n--- Priority (Preemptive) Scheduling ---");
                    priorityPreemptive(processes);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}