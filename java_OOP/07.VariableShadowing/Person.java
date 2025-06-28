public class Person {
        //field
        String name;
        String address;
        final String country = "indonesia";

        //Constructor (shadowing)
        Person(String name, String adress){
                name = name;
                address =  adress;

          // kalau kita memakai name lagi, maka akan kembali ke parameter name, bukan field name
        }


        //method dengan variable shadowing
        void sayHello(String name){
                System.out.println("hello " + name + " my name is " + name);
        }

}

/*
- variable shadowing adalah kejadian ketika membuat nama variable dengan nama yang sama di scope sehingga
menutupi variable dengan nama yang sama di scope atasnya
-saat terjadi variable shadowing , maka secara otomatis variable di scope di atasnya tidak bisa diakses

 */
