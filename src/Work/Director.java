package Work;

public class Director implements Employees {
    String jobTitle = "Director";

    @Override
    public void printJobTitle() {
        System.out.println("Job title is " + jobTitle);
    }

}
