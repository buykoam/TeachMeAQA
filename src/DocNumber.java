import java.util.Arrays;
import java.util.Locale;


public class DocNumber {
    static String str = "1234-abc-5678-def-1a2b";

    // Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void getFourNumbers() {
        String[] subStr;
        String delimeter = "-"; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
        System.out.println("Document Number: " + subStr[0] + subStr[2]);
    }

    // Вывести на экран номер документа, но блоки из трех букв заменить
    // на *** (каждая буква заменятся на *).
    public static void replaceLetters() {
        String result = "";
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(strToArray[i])) {
                result += "*";
                continue;
            }
            result += strToArray[i];
        }
        System.out.println(result);
    }

    //Вывести на экран только одни буквы из номера документа в
    //формате yyy/yyy/y/y в нижнем регистре.
    public static void getLettersInLowercase() {
        String str2 = "1234-abc-5678-DeC-9g0H";
        String[] subStr;
        String delimeter = "-"; // Разделитель
        subStr = str2.split(delimeter);
        System.out.println("DocNumber : " + subStr[1].toLowerCase() + '/' + subStr[3].toLowerCase() + '/' + subStr[4].substring(1, 2).toLowerCase() + '/' + subStr[4].substring(3, 4).toLowerCase());
    }

    //Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder).
    public static void getLettersInUppercase() {
        StringBuilder str3 = new StringBuilder("1234-abc-5678-DeC-9g0H");
        StringBuilder subStr;
        String delimeter = "-"; // Разделитель
        subStr = new StringBuilder(str3.substring(5, 8).toUpperCase());
        StringBuilder subStr2 = new StringBuilder(str3.substring(14, 17).toUpperCase());
        StringBuilder subStr3 = new StringBuilder(str3.substring(19, 20).toUpperCase());
        StringBuilder subStr4 = new StringBuilder(str3.substring(21, 22).toUpperCase());
        System.out.println("Letters: : " +subStr + '/' + subStr2+ '/' + subStr3 + '/' + subStr4);
    }
    //Проверить содержит ли номер документа последовательность abc и
    //вывети сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью).
    public static void isStringContainsSubstr() {
        boolean s = str.contains("ABC") || str.contains("abc");
        System.out.println("String contains 'ABC'/'abc' : " + s);
    }
    //Проверить начинается ли номер документа с последовательности
    //555
    public static void checkStringBeginning() {
        String[] subStr;
        String delimeter = "-"; // Разделитель
        subStr = str.split(delimeter);
        boolean check = (str.substring(0, 3) == "555");
        System.out.println("Does the document number start with the sequence '555': "+check);
    }
    // Проверить заканчивается ли номер документа на
    //последовательность 1a2b.

    public static void checkStringEnding() {
        String str = "1234-abc-5678-def-1a2b";
        String[] subStr;
        String delimeter = "-"; // Разделитель
        subStr = str.split(delimeter);
        String lastFour = str.substring(str.length()-4);
        if(lastFour == "1a2b")
        {
            System.out.println("The document number end with the sequence '1a2b'");
        }
        else
        {
            System.out.println("The document number doesn't end with the sequence '1a2b'");
        }
    }
}


