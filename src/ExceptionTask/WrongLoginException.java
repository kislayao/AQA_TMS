package ExceptionTask;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Login should be less than 20 symbols and can't contain spaces");
    }

    public WrongLoginException(String message) {
       super(message);
    }

    public boolean exitValue() {
        return false;
    }
}
