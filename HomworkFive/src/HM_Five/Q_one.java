package HM_Five;

public class Q_one {
    public static void main ( String[] args ) {

    Countre countre=new Countre ();
        System.out.println ("the countre = "+countre.getvalue ()+"\n");

        countre.Click ();
        countre.Click ();
        countre.Click ();
        System.out.println ("the countre = "+countre.getvalue ()+"\n");

        countre.undo ();
        System.out.println ("the countre = "+countre.getvalue ()+"\n");

    }
}
