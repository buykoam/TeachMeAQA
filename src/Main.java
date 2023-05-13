import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        getAnswerForNumbers();
    }
// Number 1
    public static void getAnswerForNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number[] = {1, 2, 3, 4, 5, 6};
        int i = input.nextInt();
        if (i <= number[0] || i <= number[1] || i <= number[2] || i <= number[3] || i <= number[4] || i <= number[5]) {
            System.out.println(i + " число входит в массив");
        } else {
            System.out.println("Число не входит в массив");
        }
    }
}