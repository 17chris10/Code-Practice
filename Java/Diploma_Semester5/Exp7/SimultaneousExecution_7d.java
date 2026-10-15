class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Alphabet: " + c);
        }
    }
}

class SymbolThread extends Thread {
    public void run() {
        char[] symbols = {'@', '#', '$', '%', '*'};
        for (char s : symbols) {
            System.out.println("Symbol: " + s);
        }
    }
}

public class SimultaneousExecution_7d {
    public static void main(String[] args) {
        new NumberThread().start();
        new AlphabetThread().start();
        new SymbolThread().start();
    }
}