public enum PlaneType {
    Boing747(400),
    Boing737(120);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
