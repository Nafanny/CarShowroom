import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

    UserScan us = new UserScan();
    us.scanner();

    Car speed = new Car(us);
    }
}
