package ExceptionTask;

public class CheckData {

    public static boolean checkData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException();
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException();
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        return true;
    }
}
