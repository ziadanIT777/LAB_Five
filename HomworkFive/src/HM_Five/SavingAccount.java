package HM_Five;

public class SavingAccount {

    private double balance ;
    private double initBabalance;
    private double interest;
     public SavingAccount(double initBabalance,double interest){
          balance = initBabalance;
          balance += initBabalance*interest;
    }
    public void addinterest(){
        balance+=(balance*interest);
    }

    public double getBalance () {
        return balance;
    }
}
