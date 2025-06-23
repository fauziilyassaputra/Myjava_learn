public class Variable {
    public static void main(String[] args) {

        // variable langsung
        int age = 30;
        String address = "new eridu";

        System.out.println(age);
        System.out.println(address);

        // variable dengan tipe data default dahulu
        String name;
        name = "hoshimi miyabi";

        System.out.println(name);

        //mengganti isi variable (pastikan dengan tipe data yang sama)
        name = "asoba harumasa";
        System.out.println(name);


        //menggunakan var
        var firstName = "hoshimi";
        var lastName = "miyabi";

        //menggunakan final
        final String leader = "hoshimi miyabi";
//        leader = "shukishiro yanagi"; // Error



    }
}

/*
- variable di java kita bisa menggunakan tipe data lalu diikuti dengan nama variablenya
- nama variable tidak boleh mengandung whitespace dan tidak boleh sepenuhnya number
- default value variable string adalah null
- default value variable integer adalah 0
- java sekarang mendukung pembuatan variable dengan kata kunci var, namun harus dimasukkan value
secara langsung.
- gunakan kata kunci final agar variable tidak bisa diubah-ubah (atau disebut constan)
 */
