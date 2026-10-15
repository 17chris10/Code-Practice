class WorkerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " executing step " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JoinMethod_7f{
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        WorkerThread t2 = new WorkerThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        try {
            t1.join(); // Main thread waits until t1 finishes completely
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // t2 starts only after t1 finishes
    }
}