package Figure;

public class Triangle extends Figure {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    void getP() {
        double p = getA() + getВ() + getС();
        System.out.println("P = " + p);
    }
}
