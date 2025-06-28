public class Shape {

    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{

    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }

}

/*
Super keyword:
- kadang kita ingin mengakses method yang terdapat pada class parent yang sudah terlanjur kita override di class child
- untuk mengakses method milik  class parent, kita bisa menggunakan kata kunci super
- sederhananya, super digunakan untuk mengakses class parent
- tidak hanya method, field milik parent classpun bisa kita akses menggunakan kata kunci super

 */
