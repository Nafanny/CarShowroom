public final class RusControl implements Controlable {
    @Override
    public String steering() {
        return "very BAD!";
    }

    @Override
    public int acceleration() {
        return 12;
    }

    @Override
    public int brakingDistance() {
        return 8;
    }
}
