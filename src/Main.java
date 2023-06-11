import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\TeachMeAQA\\TeachMeAQA\\src\\Name.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()) {

            list.add(scanner. nextLine());

            System.out.println(scanner.nextLine());

        }
        scanner.close();
    }
}
