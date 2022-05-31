public class Car {

    public double maxSpeed(double eng, int trans){

        setEngine(eng);
        setTransmissionGears(trans);
        double maxS = eng * trans + 100;
        System.out.println("Max speed your car is: " + maxS);
        return maxS;
    }
}
