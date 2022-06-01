public class USControl implements Controlable{
    @Override
    public String steering() {
        return "NORMAL!";
    }

    @Override
    public int acceleration() {
        return 7;
    }

    @Override
    public int brakingDistance() {
        return 4;
    }
}
