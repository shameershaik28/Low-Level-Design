package LLD1.OOPS.ENUM.Example3;

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);



    private int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

