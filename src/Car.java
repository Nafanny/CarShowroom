public final class Car {

    public float getSpeed(UserScan us) {
        if (us == null) {
            return -1F;
        }
        return us.getEngine() * us.getTransmissionGears() + 100;
    }

    public CarType getType(UserScan us) {
        if (us == null) {
            return CarType.ANY;
        }

        if (us.getEngine() > 1.2 & us.getEngine() <= 1.7 & us.getTransmissionGears() >= 3 & us.getTransmissionGears() < 5) {
            return CarType.RUSSIAN;
        } else if (us.getEngine() >= 1.8 & us.getEngine() <= 3.0 & us.getTransmissionGears() >= 5 & us.getTransmissionGears() <= 6) {
            return CarType.GERMANY;
        } else if (us.getEngine() >= 3.0 & us.getEngine() <= 6.0 & us.getTransmissionGears() >= 7 & us.getTransmissionGears() <= 8) {
            return CarType.AMERICAN;
        } else {
            return CarType.ANY;
        }
    }
}
