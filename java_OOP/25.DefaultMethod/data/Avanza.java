package hollow.special.operation.data;


public class Avanza implements Car {

    // method drive dan getTier wajib di implementasikan

    public void drive() {
        System.out.println("avanza drive");
    }


    public int getTier() {
        return 4;
    }

    // method dari Hasbrand
    public String getBrand() {
        return "Toyota";
    }

    // kita tidak harus memanggil method isBig di car, karena merupakan default method
}

