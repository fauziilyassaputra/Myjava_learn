package hollow.special.operation.data;

import java.util.Objects;

// mana main class harus sama dengan nama filenya
public class Product {

     public String name;
     public int price;

     public Product(String name, int price){
         this.name = name;
         this.price = price;
     }

     public  String toString(){
         return  "product name : " + name  + ". price: " + price;
     }

     // mengecek manual

//    public boolean equals(Object obj) {
//         // jika obj sama dengan this (lokasi memorinya samna)
//        if (obj == this) {
//            return true;
//        }
//        // jika bukan dari product sudah pasti berbeda
//        if (!(obj instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) obj;
//
//        //
//        if (this.price != product.price) {
//            return false;
//        }
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }


}

/*
Equals method :
- hal yang bingung di java adalah, cara memnbandingkan object
- di java, operator == hanya untuk mengecek data primitif
- untuk non primitif pengecekannya menggunakan method equals
- dan secara default, method equals itu membandingkan dua buah object secara kesamaan posissi object didalam
memory, artinya jika kita membuat 2 object yang isi fieldnya sama, tetap dianggap beda oleh method equals
- oleh karena itu, ada baiknya kita meng-override method equals milik class object tersebut

 */
