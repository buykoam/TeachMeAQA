package Exceptions;
import java.io.IOException;
import java.util.Scanner;
public class Validation {

    private static String message = "Incorrect password";
    private static String message2 = "Incorrect login";

    public static void main(String[] args)  throws WrongLoginException, WrongPasswordException {

            System.out.println("Please enter your login: ");
            String login = enter().nextLine();
            System.out.println("Please enter your password: ");
            String password = enter().nextLine();
            System.out.println("Please confirm your password: ");
            String confirmPassword = enter().nextLine();
        try {
            getValidation(login, password, confirmPassword);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }

    public static Scanner enter() {
        return new Scanner(System.in);
    }

    static void getValidation(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        if (login.contains(" ") | login.length() > 20) {
            throw new WrongLoginException(message2);
        }
        if (password.contains(" ") | password.length() > 20) {
            throw new WrongPasswordException(message);
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
    }
}



