package Work;

public class Main {
    public static void main(String[] args) {
        Employees[] jobs = {
                new Director("Director"),
                new Accountant("Accountant"),
                new Employee("Regular employee")
        };

        for (Employees titles: jobs){
            titles.printJobTitle();
        }
    }
}
