class ThreadA extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Thread 1: " + i);
            if (i == 11) { // Second number (10 is first, 11 is second)
                try {
                    Thread.sleep(500); // Pause to transfer control to Thread 2
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println("Thread 2: " + i);
        }
    }
}
public class CtrlTransUsingsleep_7c{
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}