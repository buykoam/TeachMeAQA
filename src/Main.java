import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //getNameSeason();
        getSeasonTwoMethod();
        //getEvenlyOddNumber();
        // getWether();
    }

    // Control structures. Number 1
    public static String getNameSeason() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        String Season;
        switch (number) {

            case 1, 2, 12:
                Season = "Winter";
                break;

            case 3, 4, 5:
                Season = "Spring";
                break;

            case 6, 7, 8:
                Season = "Summer";
                break;

            case 9, 10, 11:
                Season = "Autumn";
                break;

            default:
                Season = "Sorry please try another Number";
                break;

        }
        System.out.println("Message: " + Season);
        return Season;
    }

    // Control structures. Number 2
    public static String getSeasonTwoMethod() {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = z.nextInt();

        if (number <= 2 || number == 12) {
            System.out.println("Winter");
        }

        else if (number > 2 && number <= 5) {
            System.out.println("Spring");
        }

        else if (number > 5 && number <= 8) {
            System.out.println("Summer");
        }

        else if (number > 8 && number <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Sorry please try another Number");
        }
        return null;
    }

    // Control structures. Number 3
    public static void getEvenlyOddNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = x.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    // Control structures. Number 4
    public static void getWether() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int t = x.nextInt();
        String temperature;
        if (t > -5) {
            System.out.println("Hot");
        } if (t >= - 5 || t > -20) {
            System.out.println("Normal");
        }
        if (t > -20) {
            System.out.println("Cold");
        }

    }

}
