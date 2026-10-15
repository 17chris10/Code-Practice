class PriorityWorker extends Thread {
    public PriorityWorker(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " [Priority: " + getPriority() + "] is running");
    }
}

public class ThreadPriority_7g {
    public static void main(String[] args) {
        PriorityWorker t1 = new PriorityWorker("Low-Priority Thread");
        PriorityWorker t2 = new PriorityWorker("Medium-Priority Thread");
        PriorityWorker t3 = new PriorityWorker("High-Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}