package ExceptionTask;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Password should contain at least one digit, be less than 20 symbols and can't contain spaces");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}