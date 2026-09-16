package Bank;

public class Account{
    double bal;
    public Account(double bal){
        this.bal=bal;
    }
    public double deposit(double amt){
        bal+=amt;
        return bal;
    }
    public double withdraw(double amt){
        if(bal>=amt)
            bal-=amt;
        else
            System.out.println("Not enough money");
        return bal;
    }
    public double chkBal(){
        return bal;
    }
}
