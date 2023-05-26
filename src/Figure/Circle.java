package Figure;

public class Circle extends Figure {
    public Circle(double r, double pi) {
        super(r, pi);
    }

    @Override
    void getP() {
        double c = 2 * getPi() * getR();
        System.out.println("C = " + c);
    }
}

