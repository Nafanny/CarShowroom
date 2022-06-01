import java.util.Scanner;

public class UserScan {
    private String carColor;
    private double engine;
    private int transmissionGears;

    public UserScan(String carColor) {
        this.carColor = carColor;
    }

    public double getEngine() {
        return engine;
    }

    public int getTransmissionGears() {
        return transmissionGears;
    }

    public UserScan() {

        System.out.println("Input parameters your car.");
        Scanner scan = new Scanner(System.in);

        System.out.print("Choose car color from the list (white, black, blue, red, green, yellow): ");
        carColor = scan.nextLine();

        String[] color = {"white", "black", "red", "green", "blue", "yellow"};
        for (int i = 0; i < color.length; i++) {
            if (carColor.equals(color[i])){
                System.out.println("You choose this color: "+ carColor);
            }else
                System.out.println("There isn't this color!");
        }

        System.out.print("Enter the engine size from the range (1,3 - 6,0): ");
        engine = scan.nextDouble();

        System.out.print("Input count transmission gears from the list (3, 4, 5, 6, 7, 8): ");
        transmissionGears = scan.nextInt();
        scan.close();
    }

    public void scanner () {

        if (engine > 1.2 & engine <= 1.7 & transmissionGears >= 3 & transmissionGears < 5){
            System.out.println("You have chosen a Russian car!");
            System.out.printf("Car color is: %s \nEngine volume: %.1f \nCount gears: %d \n",carColor,engine,transmissionGears);

        } else if (engine >= 1.8 & engine <= 3.0 & transmissionGears >= 5 & transmissionGears <= 6) {
            System.out.println("You have chosen a Germany car!");
            System.out.printf("Car color is: %s \nEngine volume: %.1f \nCount gears: %d \n",carColor,engine,transmissionGears);

        } else if (engine >= 3.0 & engine <= 6.0 & transmissionGears >= 7 & transmissionGears <= 8) {
            System.out.println("You have chosen a American car!");
            System.out.printf("Car color is: %s \nEngine volume: %.1f \nCount gears: %d \n",carColor,engine,transmissionGears);

        }else
            System.out.println("You have entered an invalid value!");
    }
}
