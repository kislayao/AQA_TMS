package Work;

public class Main {
    public static void main(String[] args) {
        Employees[] jobs = {
                new Director(),
                new Accountant(),
                new Employee()
        };

        for (Employees titles: jobs){
            titles.printJobTitle();
        }
    }
}
