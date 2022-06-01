import java.util.Scanner;

public final class UserScan {
    private String carColor;
    private float engine;
    private int transmissionGears;


    public float getEngine() {
        return engine;
    }

    public int getTransmissionGears() {
        return transmissionGears;
    }


    public void scan() {
        System.out.println("Input parameters your car.");

        try(final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Choose car color from the list (white, black, blue, red, green, yellow): ");
            carColor = scanner.nextLine();

            final String[] color = {"white", "black", "red", "green", "blue", "yellow"};
            boolean carMatch = false;
            for (int i = 0; i < color.length; i++) {
                if (carColor.equals(color[i]));
                    if(carMatch = true);
            }
            if(carMatch){
                System.out.println("OK");
            }else 
                carColor = scanner.nextLine();

            System.out.print("Enter the engine size from the range (1,3 - 6,0): ");
            engine = scanner.nextFloat();

            System.out.print("Input count transmission gears from the list (3, 4, 5, 6, 7, 8): ");
            transmissionGears = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("error: " + e.getMessage());
        }
    }

    public void getScanResult () {

        final Car car = new Car();
        final float carSpeed = car.getSpeed(this);
        final CarType carType = car.getType(this);

        System.out.printf("You have chosen a %s!\n", carType.getName());
        System.out.printf("Car color is: %s \nEngine volume: %.1f \nCount gears: %d \nSpeed: %.1f\n",carColor,engine,transmissionGears, carSpeed);

        Controlable controlCar = null;
        switch (carType) {
            case RUSSIAN -> {
                controlCar = new RusControl();
                break;
            }
            case GERMANY -> {
                controlCar = new GerControl();
                break;
            }
            case AMERICAN -> {
                controlCar = new USControl();
                break;
            }
        }

        if (controlCar != null) {
            System.out.printf("Car steering is: %s \nacceleration is: %d \nbrakingDistance is: %d \n",
                    controlCar.steering(), controlCar.acceleration(), controlCar.brakingDistance());
        }
    }
}
