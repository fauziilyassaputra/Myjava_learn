package hollow.special.operation.app;

import hollow.special.operation.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId(null);  // tidak bakal masuk karena terkena validasi

//      System.out.println(category.id); // ERROR
        System.out.println(category.getId());
    }
}

/*
Encapsulation :
- encapsulatiron artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
- hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
- untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access private, sehingga tidak bisa diakses dari luar
- agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut

 */
