package Work;

public class Employee implements Employees {

    String jobTitle = "Regular employee";

    @Override
    public void printJobTitle() {
        System.out.println("Job title is " + jobTitle);
    }
}
