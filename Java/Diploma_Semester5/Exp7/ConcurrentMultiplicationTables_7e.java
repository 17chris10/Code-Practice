class TablePrinter implements Runnable {
    private int number;

    public TablePrinter(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class ConcurrentMultiplicationTables_7e{
    public static void main(String[] args) {
        // Multiples of 2 and 5 running concurrently
        Thread t1 = new Thread(new TablePrinter(2));
        Thread t2 = new Thread(new TablePrinter(5));

        t1.start();
        t2.start();
    }
}