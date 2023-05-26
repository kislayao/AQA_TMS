package PhoneTask;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone (String number, String model, double weight){
        this (number, model);
        this.weight = weight;
    }

    public Phone (String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone (){}

    public void receiveCall(String name){
        System.out.println(name + " is calling you");
    }

    public void receiveCall(String name, String number){
        System.out.println(name + " is calling you\n" + name + "'s number is " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String ... nums){
        System.out.println("PhoneTask.Phone number(s) to send message: ");
        for (String elements: nums){
            System.out.println(elements);
        }
    }

    public void getAllInfo(){
        System.out.println("PhoneTask.Phone number: " + number +"\nPhoneTask.Phone model: " + model + "\nPhoneTask.Phone weight: " + weight);
    }
}
