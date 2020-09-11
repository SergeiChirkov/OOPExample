package Autopark;

public abstract class Car {
    private int weight;
    private String color;
    protected int power;

    public Car(int weight, String color, int power) {
        this.weight = weight;
        this.color = color;
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
