package Runner;

import Autopark.Car;
import Autopark.Lada;
import Autopark.Toyota;

public class Runner {
    public static void main(String[] args) {
        Lada vesta = new Lada(1100, "green", 106);
        Toyota landCruiser = new Toyota(2500, "black", 280);

        vesta.getBroken();
        vesta.getBroken();

        try {
            vesta.getBroken();
        } catch (RuntimeException e) {
            System.out.println("Ooops, something went wrong!");
        }


        Car[] cars = new Car[]{vesta, landCruiser};
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
