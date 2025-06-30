package hollow.special.operation.data;

 class SocialMedia {
     String name;
}

// tidak boleh ada lagi turunannya
final class Facebook extends SocialMedia{

}
//  class FakeFacebook extends Facebook{} // ERROR


/*
- sebelumnya kita sudah menggunakan kata kunci final di java
- jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya
- final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class, maka
kita menandakan bahwa class tersebut tidak bisa diwariskan lagi
- secara otomatis semua class childnya akan error
 */
