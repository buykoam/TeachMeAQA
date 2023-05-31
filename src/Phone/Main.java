package Phone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Phone sumsung = new Phone(294877656, "Sumsung galaxy s22", 0.177);
        Phone nokia = new Phone(334356587, "Nokia E74", 0.91);
        Phone honor = new Phone(445673465, "Honor 9", 0.80);

        sumsung.getInformationPhone();
        sumsung.receiveCall("Anna");
        System.out.println();
        nokia.getInformationPhone();
        nokia.receiveCall("Max");
        System.out.println();
        honor.getInformationPhone();
        honor.receiveCall("Vlad");
        System.out.println();
        sumsung.sendMessage("257653456","224579867","334568764");
    }

}