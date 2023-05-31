package Work;

public class Accountant implements Employees {
    String jobTitle = "Accountant";

    @Override
    public void printJobTitle() {
        System.out.println("Job title is " + jobTitle);
    }

}
