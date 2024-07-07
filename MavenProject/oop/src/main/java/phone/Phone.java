package phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static Phone getNumber(Phone number) {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
    }

    public Phone() {

    }

    public static void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером " + number);
    }

    public static void sendMessage(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.print(args[i] + " ");
        }
        System.out.print("\n");
    }

    @Override
    public String toString() {
        System.out.println("number: " + this.number + ", model: " + this.model + ", weight: " + this.weight);
        return "";
    }

}
