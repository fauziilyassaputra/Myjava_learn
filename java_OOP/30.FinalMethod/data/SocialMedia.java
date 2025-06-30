package hollow.special.operation.data;

 class SocialMedia {
     String name;
}


 class Facebook extends SocialMedia{
     // membuat methof final
   final  void login(String username, String password){
         // isi method
     }

}
  class FakeFacebook extends Facebook{
//      void login(String username, String password){// isi method} // ERROR
  }


/*
Final class :
- kata kunci final juga bisa digunakan di method
- jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override
lagi di class childnya
- ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class childnya
 */
