package Work;

public class Main {
    public static void main(String[] args) {
        Employees[] jobs = {
                new Director("Director"),
                new Accountant("Accountant")
        };

        for (Employees titles: jobs){
            titles.printJobTitle();
        }
    }
}
