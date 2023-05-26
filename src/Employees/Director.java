package Employees;
public class Director implements Employees {
    String positionName = "Director";

    @Override
    public void getPositionName() {
        System.out.println("Title of the position is " + positionName);
    }
}
