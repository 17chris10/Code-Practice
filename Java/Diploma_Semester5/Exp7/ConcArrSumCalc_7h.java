class ArraySumThread extends Thread {
    private int[] array;
    private int sum = 0;

    public ArraySumThread(int[] array, String name) {
        super(name);
        this.array = array;
    }

    public void run() {
        for (int num : array) {
            sum += num;
        }
        System.out.println(getName() + " Sum: " + sum);
    }
}

public class ConcArrSumCalc_7h {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30};
        int[] array3 = {100, 200, 300, 400};

        ArraySumThread t1 = new ArraySumThread(array1, "Thread-1");
        ArraySumThread t2 = new ArraySumThread(array2, "Thread-2");
        ArraySumThread t3 = new ArraySumThread(array3, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}