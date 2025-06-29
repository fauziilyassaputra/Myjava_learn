package hollow.special.operation.data;

// gunakan extends untuk sesama interface
public interface Car extends HasBrand{

   // public abstract adalah default accessnya sehingga tidak perlu diketik ulang
    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    };

}

/*
Dafault Method :
- di interface, kita tidak bisa membuat method konkrit yang memiliki block method
- namun sejak versi Java 8, ada fitur default method di interface
- fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement akan rusak karena harus meng-override mnethod tersebut
- ketika kita menambahkan satu method interface. secara otomatis semua class yang inmplement akan rusak karena harus meng-override method tersebut
- dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
 */
