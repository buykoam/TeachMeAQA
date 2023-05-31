package Exceptions;
import java.util.Scanner;
public class Validation {

    private static String massage = "Incorrect password";
    private static String massage2 = "Incorrect login";

    public static void main(String[] args) {
        System.out.println("Please enter your login: ");
        String login = enter().nextLine();
        System.out.println("Please enter your password: ");
        String password = enter().nextLine();
        System.out.println("Please confirm your password: ");
        String confirmPassword = enter().nextLine();
    }

    public static Scanner enter() {
        return new Scanner(System.in);
    }

    static void getValidation(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        if (login.contains(" ") | login.length() > 20) {
            throw new WrongLoginException(massage2);
        }
        {
            if (password.contains(" ") | password.length() > 20) {
                throw new WrongPasswordException(massage);
            }
            if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException();
            }
        }
    }
}


