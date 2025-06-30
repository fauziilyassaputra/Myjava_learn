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


    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }



}

/*
hashCode method :
- method hashcode adalah method representasi integer object kita, mirip toString yang merupakan representasi String, hashCOde adalah representasi integer
- Hashcode sangat bermanfaat untuk membuat struktur data unique seperti hahsmap, set, dan lain-lain, karena
cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
- secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverridenya jika kita ingin

 */
