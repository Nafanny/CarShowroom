public class Car extends UserScan{

    public double maxSpeed(double eng, int trans){

        setEngine(eng);
        setTransmissionGears(trans);
        double maxS = eng * trans;
        System.out.println("Max speed your car is: " + maxS);
        return maxS;
    }
}
