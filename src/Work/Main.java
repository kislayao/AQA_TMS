package Work;

public class Main {
    public static void main(String[] args) {
        JobDescription[] jobs = {
                new Director("Director"),
                new Employee("Employee"),
                new Accountant("Accountant")
        };

        for (JobDescription titles: jobs){
            titles.printJobTitle();
        }
    }
}
