import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //getNameSeason();
        //getSeasonTwoMethod();
        getEvenlyOddNumber();
    }

    public static String getNameSeason()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        String Season;
        switch (number) {

            case 1:
                Season = "Winter";
                break;

            case 2:
                Season = "Spring";
                break;

            case 3:
                Season = "Summer";
                break;

            case 4:
                Season = "Autumn";
                break;

            default:
                Season = "Sorry please try another Number";
                break;

        }
        System.out.println("Message: " + Season);
        return Season;
    }

    public static String getSeasonTwoMethod() {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = z.nextInt();

        if (number == 1)
        {
            System.out.println("Winter");
        }

        if (number == 2)
        {
            System.out.println("Spring");
        }

        if (number == 3)
        {
            System.out.println("Summer");
        }

        if (number == 4)
        {
            System.out.println("Autumn");
        }

        else
        {
            System.out.println("Sorry please try another Number");
        }
        return null;
    }

    public static void getEvenlyOddNumber()
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = x.nextInt();

        if (number % 2)
        {
            System.out.println("Четное");
        }

        else
        {
            System.out.println("Нечетное");
        }
    }
}