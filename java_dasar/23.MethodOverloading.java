public class MethodOverloading {
    public static void main(String[] args) {

    }
    static void sayHello(){
        System.out.println("hello");
    }
    static  void  sayHello(String name){
        System.out.println("hello" + name);
    }
    static void  sayHello(String name, String lastName){
        System.out.println("welcome " + name + " " + lastName);
    }
}

/*
-method overloading adalah kemampuan method dengan nama yang sama lebih dari sekali
-namun ada ketentuannya, yaitu data parameter harus berbeda-beda, entah jumlah atau tipe data parameternya
- jika ada yang sama, maka program java kita akan error

 */
