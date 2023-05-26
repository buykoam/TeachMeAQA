package Figure;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        figureArray();
    }
    public static void figureArray()
    {
        Figure[] figures = {
                new Rectangle(4,5),
                new Triangle(5, 5,2),
                new Circle(9,3.14),
                new Circle(3, 3.14),
                new Triangle(3,5,8)
        };
        for (Figure figure : figures)
        {
            figure.getP();
            System.out.println();
        }
    }
}