public class Car {

    public void maxSpeed(UserScan us){

        double maxS = us.getEngine() * us.getTransmissionGears() + 100;
        System.out.println("Max speed your car is: " + maxS);
    }
}
