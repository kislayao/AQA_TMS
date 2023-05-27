package ExceptionTask;

public class CheckData {
    public CheckData(){};

    public static boolean checkData (String login, String password, String confirmPassword){
        try {
            checkLogin(login);
            checkPassword (password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e);
            return false;
        }
    }

    public static void checkLogin(String login) throws WrongLoginException{
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException();
        }
    }

    public static void checkPassword (String password, String confirmPassword) throws WrongPasswordException{
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException();
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords doesn't match");
        }
    }
}
