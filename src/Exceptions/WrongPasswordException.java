package Exceptions;

public class WrongPasswordException extends Exception {
    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password)
    {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public WrongPasswordException()
    {
        super();
    }
}
