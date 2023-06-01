package Exceptions;

public class WrongPasswordException extends Exception {
    private String password;
    private String confirmPassword;
    private String message = "Incorrect password";

    public WrongPasswordException()
    {

    }

    public WrongPasswordException(String message) {
        super(message);
        this.message = message;
    }
}
