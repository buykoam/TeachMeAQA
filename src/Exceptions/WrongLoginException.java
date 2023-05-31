package Exceptions;

public class WrongLoginException extends Exception {
   private String login;
    public WrongLoginException(String login) {
        this.login = login;
    }
    public WrongLoginException()
    {
        super();
    }
}
