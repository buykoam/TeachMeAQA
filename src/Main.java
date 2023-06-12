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

/*here, add code to declare a variable and
 let it be the key set of the map
 */
        String key;

//temporary variables
        String tempWord;
        String tempDef;

//the following code reads data from the file glossary.txt
//and saves the data as entries in the map
        Scanner infile = new Scanner(new File("D:\\TeachMeAQA\\TeachMeAQA\\src\\words.txt"));

        while (infile.hasNextLine()) {
            tempWord = infile.nextLine();
            tempDef = infile.nextLine();

  /*here, add code to add tempWord and tempDef
   as an entry in the map
   */
            treeMap.put(tempWord, tempDef);

        }
        infile.close();

        while (true) {
            System.out.println();
            System.out.println();

            //show menu and prompt message
            System.out.println("Please select one of the following actions:");
            System.out.println("q - Quit");
            System.out.println("a - List all words and their definitons");
            System.out.println("b - Delete an entry");
            System.out.println("Please enter a, b, q: ");

            String selection = kb.nextLine();  //read user's selection
            if (selection.equals("")) continue; //if selection is "", show menu again

            switch (selection.charAt(0)) {
                case 'q':
                    System.out.println("\nThank you.");
                    return;

                case 'a':
                    for (Object treeKey : treeMap.keySet())
                        System.out.println(treeKey);

            }
        }
    }
}