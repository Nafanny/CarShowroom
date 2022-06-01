public class Car {

    private String russianCar;
    private String germanyCar;
    private String americanCar;

    public Car(UserScan us) {
        double maxS = us.getEngine() * us.getTransmissionGears() + 100;
        System.out.println("Max speed your car is: " + maxS);
    }
}
