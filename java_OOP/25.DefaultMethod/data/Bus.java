package hollow.special.operation.data;

public class Bus  implements Car {


    public void drive() {
        System.out.println("Bus drive");
    }


    public int getTier() {
        return 8;
    }


    public String getBrand() {
        return "HINO";
    }

    // kita panggil default method
    public boolean isBig() {
        return true;
    }
}
