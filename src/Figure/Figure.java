package Figure;

public abstract class Figure {
    private double a;
    private double b;
    private double с;
    private double r;
    private double pi = 3.14;

    public Figure (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.с = c;
    }
    public void Figure (int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public Figure (double r, double pi)
    {
        this.r = r;
        this.pi = pi;
    }
    public double getA()
    {
        return a;
    }
    public double getВ()
    {
        return a;
    }
    public double getС()
    {
        return a;
    }
    public double getR(){return r;}
    public double getPi(){return pi;}

    void getP()
    {
        double p = 2*(a+b);
        System.out.println("P = " +p);
    }
    void getS()
    {
        double s = a*b;
        System.out.println("S = " +s);
    }
}
