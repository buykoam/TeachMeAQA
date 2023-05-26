package Employees;
public class Accountant implements Employees {
    String positionName = "Accountant";

    @Override
    public void getPositionName() {
        System.out.println("Title of the position is " + positionName);
    }
}