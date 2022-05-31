public class Car {

        double engine;
        int transmission;

        double maxSpeed (double volumeEng, int transGears){
            engine = volumeEng;
            transmission = transGears;
            double maxS = volumeEng * transGears;
            System.out.println("Max speed your car is: " + maxS);
        return maxS;
        }
}
