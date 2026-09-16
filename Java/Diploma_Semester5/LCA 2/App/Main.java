package App;
import Bank.Account;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance:");
        double b=sc.nextDouble();
        Account a = new Account(b);
        System.out.println("1: Deposit\n2: Withdraw\n3. Check Balance");
        System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter amount to deposit:");
                double amt=sc.nextDouble();
                System.out.print("Account balance after deosit: "+a.deposit(amt));
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                double w=sc.nextDouble();
                System.out.print("Account balance after deosit: "+a.withdraw(w));
                break;
            case 3:
                System.out.println("Current balance: " + a.chkBal());
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    
    }
}
