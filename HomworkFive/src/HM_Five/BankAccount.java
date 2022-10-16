
package HM_Five;

public class BankAccount {
    private double balance;

    public BankAccount () {
        balance = 0;
    }

    public BankAccount ( double initBabalance ) {
        balance = initBabalance;
    }

    public void deposint ( double amount ) {
        balance += amount;
    }

    public void Withdraw ( double amount ) {
        balance -= amount;
    }
/*
The methods a addinterest Q_Four #
*/
    public void addinterest( double percentage){
        balance+=(balance * percentage);

    }

    public void mystery( BankAccount that, double amount ){
        this.balance = that.balance-amount;
        that.balance=that.balance+amount;
        System.out.println (" this.balance="+ this.balance);
        System.out.println ("\n that.balance="+ that.balance);

    }

    public double getBalance () {
        return balance;
    }
}