package Autopark;

public final class Lada extends Car {
    private int defaultPower;

    public Lada(int weight, String color, int power) {
        super(weight, color, power);
    }

    public void getBroken() {
        defaultPower = power;
        power = 0;
    }

    public void repair() {
        power = defaultPower;
    }
}
