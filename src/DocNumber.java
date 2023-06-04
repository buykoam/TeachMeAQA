import java.util.Arrays;
import java.util.Locale;


public class DocNumber {
    static String str = "1234-abc-5678-def-9g0h";

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
        // String str3 = "1234-abc-5678-DeC-9g0H";
        StringBuilder subStr;
        String delimeter = "-"; // Разделитель
        subStr = new StringBuilder(str3.substring(5, 8).toUpperCase());
        StringBuilder subStr2 = new StringBuilder(str3.substring(13, 17).toUpperCase());
        StringBuilder subStr3 = new StringBuilder(str3.substring(19, 20).toUpperCase());
        StringBuilder subStr4 = new StringBuilder(str3.substring(21, 22).toUpperCase());
        System.out.println("DocNumber : " +subStr + '/' + subStr2+ '/' + subStr3 + '/' + subStr4);
    }
}


