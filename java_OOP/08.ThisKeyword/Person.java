public class Person {
        //field
        String name;
        String address;
        final String country = "indonesia";

        //Constructor
        Person(String name, String adress){
                this.name = name;
                this.address =  adress;
        }


        //method
        void sayHello(String name){
                System.out.println("hello " + name + " my name is " + this.name);
        }

}

/*
This keyword :

- saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kiata kunci
this untuk mengakses object saat ini
- misal kita butuh mengakses sebuah field yang namanya sama dengan parameter method, kita tidak bisa mengaksesnya
langsung, kita bisa mengaksesnya dengan kata kunci this
- this juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk
mengakses method
- this bisa digunakan untuk mengatasi masalah variable shadowing
 */
