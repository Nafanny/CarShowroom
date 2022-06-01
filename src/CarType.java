public enum CarType {

    RUSSIAN("RUS", "Russian car"),
    GERMANY("GER", "Germany car"),
    AMERICAN("USA", "American car"),
    ANY("ANY", "Any car");

    private String code;
    private String name;

    CarType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
