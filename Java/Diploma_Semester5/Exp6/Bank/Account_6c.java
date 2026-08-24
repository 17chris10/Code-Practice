package Diploma_Semester5.Exp6.Bank;

public class Account_6c {
    private String accNum;
    private String accH;
    private double bal;

    // Constructor to initialize account details
    public Account_6c(String accNum, String accH, double bal) {
        this.accNum = accNum;
        this.accH = accH;
        this.bal = bal;
    }

    // Method to deposit money
    public void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Successfully deposited $" + amt + " into account " + accNum);
        } else {
            System.out.println("Invalid deposit amt!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Successfully withdrew $" + amt + " from account " + accNum);
        } else if (amt > bal) {
            System.out.println("Insufficient bal in account " + accNum + "!");
        } else {
            System.out.println("Invalid withdrawal amt!");
        }
    }

    // Method to check bal
    public void checkBal() {
        System.out.println("Account: " + accNum + " | Holder: " + accH + " | Current Balance: $" + bal);
    }

    // Getter for Account Number
    public String getaccNum() {
        return accNum;
    }
}