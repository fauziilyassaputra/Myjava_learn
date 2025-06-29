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
}

/*
Interface Inheritance :
- kita tahu bahwa di java child class hanya bisa punya 1 class parent
- berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
- bahkan interface pun bisa implement interface laon, bisa lebih dari 1. namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci
extends, bukan implements
 */
