package hollow.special.operation.app;

import hollow.special.operation.data.Animal;
import hollow.special.operation.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        // kita disini gunakan polimorfisme (optional)
        Animal animal = new Cat();
        animal.name = "nekomata";
        animal.run();

    }
}
