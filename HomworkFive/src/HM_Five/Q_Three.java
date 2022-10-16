package HM_Five;

public class Q_Three {

      public static void main ( String[] args ) {
        BankAccount bank = new BankAccount ();

        bank.deposint ( 1000 );
        System.out.println ( "the process has successfully added account balance is = " + bank.getBalance () + "\n" );

        bank.Withdraw ( 500 );
        System.out.println ( "Yonr account has been successfully clouded is =" + bank.getBalance () + "\n" );

        bank.Withdraw ( 400 );
        System.out.println ( "Yonr account has been successfully clouded is =" + bank.getBalance () + "\n" );

     }
  }
