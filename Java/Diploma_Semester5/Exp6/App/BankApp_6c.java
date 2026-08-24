package Diploma_Semester5.Exp6.App;
import Diploma_Semester5.Exp6.Bank.Account_6c;

public class BankApp_6c{
    public static void main(String[] args) {
        // Creating multiple Account_6c objects
        Account_6c acc1 = new Account_6c("ACC101", "Alice", 1000.00);
        Account_6c acc2 = new Account_6c("ACC102", "Bob", 500.00);

        System.out.println("--- Initial Balances ---");
        acc1.checkBal();
        acc2.checkBal();

        System.out.println("\n--- Performing Transactions on Account 1 ---");
        acc1.deposit(500.00);
        acc1.withdraw(200.00);
        acc1.checkBal();

        System.out.println("\n--- Performing Transactions on Account 2 ---");
        acc2.deposit(300.00);
        acc2.withdraw(900.00); // Exceeds balance
        acc2.checkBal();
    }
}