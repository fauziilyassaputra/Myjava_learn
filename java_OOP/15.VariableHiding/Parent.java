 class Parent {
    String name;
    void doIt(){
        System.out.println("do it in parent");
    }
}

class Child extends Parent{
    // memiliki nama variable yang sama (variable hiding)
    String name;
    void doIt(){
        System.out.println("do it in child");
    }
}

/*
-variable hiding adalah masalah yang terjadi ketika kita membuat nama field sama di class child dengan nama field di class parent
- tidak ada namanya field overriding, ketika kita membuat ulang nama field di class class, itu berarti over hiding
- untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
- yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
- saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di classnya
 */
