import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

    UserScan us = new UserScan();
    us.scanner();
    Car speed = new Car();
    speed.maxSpeed(3.0, 5);

//        Car germanyCar = new Car();
//        germanyCar.engine = 1.0;
//        germanyCar.transmission = 1;
//
//        System.out.println("You choose Germany car!");
//        System.out.printf("Engine %.1f \nTransmission gears %d \n",
//                germanyCar.engine, germanyCar.transmission);
    }
}
