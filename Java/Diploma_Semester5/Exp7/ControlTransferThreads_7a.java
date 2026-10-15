class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            if (i == 2) {
                // Yield control to Thread 2 after printing the second number
                Thread.yield(); 
                try {
                    Thread.sleep(100); // Ensures Thread 2 gets execution time
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class ControlTransferThreads_7a {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}