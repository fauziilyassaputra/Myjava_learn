package hollow.special.operation.data;

// mana main class harus sama dengan nama filenya
public class Product {

//  jika fieldnya adalah private, maka tidak bisa dipanggil di file ProductApp

//    private String name;
//    private int price;

    protected String name;
    protected int price;

     Product(String name, int price){
         this.name = name;
         this.price = price;
     }

}

/*
Access level :
modifier        class       package         subclass        world

public           Y             Y                Y             Y
protected        Y             Y                Y             N
no midifier      Y             Y                N             N
private          Y             N                N             N


 */
