package Phone;

public class Phone {
    private int number;
    private String model;
    private double weight;
    private String name;


    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        number = 0;
        model = "Unknown";
        weight = 0;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void getInformationPhone() {
        System.out.println("Number " + number);
        System.out.println("Model " + model);
        System.out.println("Weight " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Call " + name + number);
    }

    void receiveCall(int number, String name) {
        System.out.println("Call " + name + " " + " Number : " + number);
    }

    void sendMessage(String... recipientNumbers) {
        System.out.println("This is message receive next numbers ");
        for (String elements : recipientNumbers) {
            System.out.print(elements + " ");
        }
    }
}

