import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //getNameSeason();
        //getSeasonTwoMethod();
        //getEvenlyOddNumber();
        //getWether();
        //getColorRainbow();
        //getOddNumber();
        //getRevers();
        //getSum();
        //getSequenceOfNumbers();
        get();
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
        System.out.println("Season " + Season);
        return Season;
    }

    // Control structures. Number 2
    public static String getSeasonTwoMethod() {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = z.nextInt();

        if (number <= 2 || number == 12) {
            System.out.println("Winter");
        } else if (number > 2 && number <= 5) {
            System.out.println("Spring");
        } else if (number > 5 && number <= 8) {
            System.out.println("Summer");
        } else if (number > 8 && number <= 11) {
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
        } else if ((t <= -5) && (t > -20)) {
            System.out.println("Normal");
        } else if (t <= -20) {
            System.out.println("Cold");
        } else {
            System.out.println("Sorry please try another Number");
        }
    }
    // Control structures. Number 5

    public static void getColorRainbow() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        String Rainbow;
        switch (number) {

            case 1:
                Rainbow = "Red";
                break;

            case 2:
                Rainbow = "Orange";
                break;

            case 3:
                Rainbow = "Yellow";
                break;

            case 4:
                Rainbow = "Green";
                break;

            case 5:
                Rainbow = "Blue";
                break;

            case 6:
                Rainbow = "Indigo";
                break;

            case 7:
                Rainbow = "Violet";
                break;

            default:
                Rainbow = "Sorry please try another Number";
                break;

        }
        System.out.println("Color: " + Rainbow);
    }

    // loop. Number 1
    public static void getOddNumber() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    // loop. Number 2
    public static void getRevers() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // loop. Number 3
    public static void getSum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++)
            sum += i;
        System.out.println("Result = " + sum);
    }

    public static void getSequenceOfNumbers() {
        int i = 7;
        while (i <= 98) {

            System.out.println(i);
            i += 7;
        }
    }

    public static void get() {
        int i = 0;
        while (i <= -50) {

            System.out.println(i);
            i -= 5;
        }
    }
}









