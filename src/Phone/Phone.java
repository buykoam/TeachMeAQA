package Phone;

public class Phone {
    private int number;
    private String model;
    private double weight;


    public Phone (int number, String model, double weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
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

    public void getInformationPhone()
    {
        System.out.println("Number " + number);
        System.out.println("Model " + model);
        System.out.println("Weight" +weight);
    }
}
