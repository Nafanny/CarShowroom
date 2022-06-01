public class Control implements ControlFunctions {

    private String steeringRus = "is very BAD!";
    private String steeringUS = "is NORMAL!";
    private String steeringGer = "is very COOL!";

    private int speedUpRus = 12;
    private int speedUpUS = 7;
    private int speedUpGer = 5;

    private int speedDownRus = 8;
    private int speedDownUS = 4;
    private int speedDownGer = 6;

    @Override
    public void steering() {
        System.out.println("Vehicle handling: ");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration from 0 to 100 for: ");
    }

    @Override
    public void brakingDistance() {
        System.out.println("Stopping distance from 60 to 0 in seconds: ");
    }
}
