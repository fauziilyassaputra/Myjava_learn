package hollow.special.operation.app;

import hollow.special.operation.data.Helloworld;

public class HelloworldApp {
    public static void main(String[] args) {
        //Anonymous class (tidak bisa di reuse)
        Helloworld english = new Helloworld() {

            public void sayHello() {
                System.out.println("hello");
            }


            public void sayHello(String name) {
                System.out.println("hello " + name);
            }
        };
        Helloworld indonesia = new Helloworld() {

            public void sayHello() {
                System.out.println("hai");
            }


            public void sayHello(String name) {
                System.out.println("hai " + name);
            }
        };

        english.sayHello();
        english.sayHello("corin");

        indonesia.sayHello();
        indonesia.sayHello("ben");

    }

}

/*
- anonymous class adalah class tanpa nama
- yaitu kemampuan mendekalarasi class, sekaligus menginstall objecctnya secara langsung
- anonymous sebenarnya termasuk inner class, dimana outerclassnya adalah tempat dimana kita membuat anonymous class tersebut
-anonymous class sangat cocok ketika berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi classnya
 */
