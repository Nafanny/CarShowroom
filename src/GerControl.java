public final class GerControl implements Controlable {
    @Override
    public String steering() {
        return "is very COOL!";
    }

    @Override
    public int acceleration() {
        return 5;
    }

    @Override
    public int brakingDistance() {
        return 6;
    }
}
