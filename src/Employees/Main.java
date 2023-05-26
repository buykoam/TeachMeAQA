package Employees;

public class Main {
    public static void main(String[] args) {
        getPositions();
    }

    public static void getPositions() {
        Director employee1 = new Director();
        employee1.getPositionName();

        Worker employee2 = new Worker();
        employee2.getPositionName();

        Accountant employee3 = new Accountant();
        employee3.getPositionName();
    }
}
