package Figure;

public class Rectangle extends Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }
    @Override
    void getP() {
        double p = 2*(getA()+getВ());
        System.out.println("P = " +p);
    }
    @Override
    void getS()
    {
        double s = getA()*getВ();
        System.out.println("S = " +s);
    }
}
