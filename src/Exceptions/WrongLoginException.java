package Exceptions;

public class WrongLoginException extends Exception {
   private String login;
   private String message = "Incorrect login";
    public WrongLoginException()
    {

    }
    public WrongLoginException(String message)
    {
        super(message);
        this.message = message;
    }
}
