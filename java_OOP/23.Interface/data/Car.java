package hollow.special.operation.data;

public interface Car {

   // public abstract adalah default accessnya sehingga tidak perlu diketik ulang
    void drive();

    int getTier();

}

/*
Interface :
- sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class childnya
- Namun yang lebih tepat untuk kontrak adalah interface
- jangan salah sangka bahwa interface disini bukanlah USer interface
- Interface mirip seperti abstract class, yang membedakannya adalah di interface, semua method otomatis abstract, tidak memiliki block
- Di interface kita tidak boleh memiliki field , kita hanya boleh memiliki constanct(field yang tidak bisa diubah
- untuk mewariskan interface, gunakan implement, bukan extend
 */
