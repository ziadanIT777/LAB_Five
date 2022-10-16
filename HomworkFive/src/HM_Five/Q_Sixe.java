package HM_Five;

public class Q_Sixe {
    public static void main ( String[] args ) {

        SavingAccount Q_Sixe =new SavingAccount ( 1000,0.01 );
        Q_Sixe.addinterest ();
        System.out.println ("the balance is =" + Q_Sixe.getBalance ()  );

    }
}
