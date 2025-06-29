package hollow.special.operation.app;

import hollow.special.operation.data.Avanza;
import hollow.special.operation.data.Car;

public class CarApp {
    public static void main(String[] args) {

        // harus memakai polimorfisme
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();

    }
}
