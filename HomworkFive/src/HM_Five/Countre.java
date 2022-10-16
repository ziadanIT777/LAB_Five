package HM_Five;

public class Countre {
    private int vaule;
    public Countre() {vaule =0;}
    public void Click() {vaule=vaule+1;}
    public void undo(){vaule=vaule-1;}
    public int getvalue() {return vaule ;}
    public void resat(){vaule = 0;}

}
