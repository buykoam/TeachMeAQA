import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        getAnswerForNumbers();
        getArray();
        getMaxMinNumber();
        getMaxOrAverageElements();
    }

    // Number 0
    public static void getAnswerForNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number[] = {1, 2, 3, 4, 5, 6};
        int i = input.nextInt();
        if (i <= number[0] || i <= number[1] || i <= number[2] || i <= number[3] || i <= number[4] || i <= number[5]) {
            System.out.println(i + " number include in array");
        } else {
            System.out.println("number not include in array");
        }
    }

    // Number 1
    public static void getArray() {
        int[] array = new int[]{5, 8, 19, 63, 54};
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your number: ");
        int number = enter.nextInt();
        boolean found = false;
        int newSize = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == number) {
                found = true;
            } else {
                array[newSize] = array[i];
                newSize++;
            }
        if (found) {
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, newSize);
            System.out.println("array elements after removal: ");

            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }

        } else {
            System.out.println("Number not found in array");
        }
    }

    // Number 2
    public static void getMaxMinNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount array:");
        int kol = in.nextInt();
        int Arr[] = new int[kol];
        int max = Arr[0], min = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Enter " + i + " element array:");
            Arr[i] = in.nextInt();
            if (max < Arr[i])
                max = Arr[i];
            if (min > Arr[i])
                min = Arr[i];
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }

    // Number 3
    public static void getMaxOrAverageElements() {
        int[] mas1 = new int[5], mas2 = new int[5];
        int s1, s2;
        double a1, a2;
        s1 = 0;
        s2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        for (int i = 0; i < mas1.length; i++) {
            s1 = s1 + mas1[i];
        }
        for (int i = 0; i < mas2.length; i++) {
            s2 = s2 + mas2[i];
        }
        System.out.println();
        a1 = (double) s1 / 5;
        a2 = (double) s2 / 5;
        if (a1 < a2) {
            System.out.println("The arithmetic mean of the first array is less than the arithmetic mean of the second array");
        } else if (a2 < a1) {
            System.out.println("The arithmetic mean of the second array is less than the arithmetic mean of the first array");
        } else {
            System.out.println("Arithmetic means are equal to each other");
        }
    }
}

