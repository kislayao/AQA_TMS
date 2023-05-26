package ExceptionTask;

public class Main {
    public static void main(String[] args) {

        CheckData dataToCheck = new CheckData();

        try {
            dataToCheck.checkData("testLogin", "pswd1", "pswd1");
        } catch (WrongLoginException eLogin) {
            System.err.println(eLogin);
            eLogin.exitValue();
        } catch (WrongPasswordException ePassword) {
            System.err.println(ePassword);
            ePassword.exitValue();
        }
    }
}
