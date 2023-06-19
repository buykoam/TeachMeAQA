import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String args[])
            throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);

        /*here, add code to declare and create a tree map*/
        TreeMap treeMap = new TreeMap();

        String key;


        String tempWord;
        String tempDef;

        Scanner infile = new Scanner(new File("D:\\TeachMeAQA\\TeachMeAQA\\src\\words.txt"));

        while (infile.hasNextLine()) {
                     //  treeMap.put(tempWord, tempDef);
            String str = "";
            str = infile.nextLine();
            String[] splitted;
            splitted = str.split( "-");
            treeMap.put(splitted[0], splitted[1]);
        }
        infile.close();
        System.out.println("Key/Value mappings: " + treeMap.entrySet());

        }
    }
