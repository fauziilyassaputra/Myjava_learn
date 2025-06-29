package hollow.special.operation.data;

// mana main class harus sama dengan nama filenya
public class Product {

     public String name;
     public int price;

     public Product(String name, int price){
         this.name = name;
         this.price = price;
     }
  
    // membuat method toString
     public  String toString(){
         return  "product name : " + name  + " . price: " + price;
     }

}

/*
ToString() :
- toString() adalah method yang terdapat di class Object
- method ini biasanya digunakan untuk memrepresentasikan object dalam bentuk string
- secara default, toString() ini akan menghasilkan :
    => namaclass + @ + hashCode
- namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
 */
