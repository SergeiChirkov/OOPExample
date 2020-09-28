package Autopark;

public final class Lada extends Car {
    private int defaultPower;

    public Lada(int weight, String color, int power) {
        super(weight, color, power);
    }

    public void getBroken() {
        defaultPower = power;
        if (power - 50 < 0) {
            throw new RuntimeException("Car can't has power less than 0");
        } else {
            power -= 50;
        }
    }

    public void repair() {
        power = defaultPower;
    }
}
