package Runner;

import Autopark.Car;
import Autopark.Lada;
import Autopark.Toyota;

public class Runner {
    public static void main(String[] args) {
        Lada vesta = new Lada(1100, "green", 106);
        Toyota landCruiser = new Toyota(2500, "black", 280);

        Car[] cars = new Car[] {vesta, landCruiser};
    }
}
