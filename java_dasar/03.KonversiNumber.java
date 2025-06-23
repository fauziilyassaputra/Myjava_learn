public class KonversiNumber{
    public static void main(String[] args) {

        // langsung otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // manual
        int iniInt2 = 10;
        byte inibyte2 =  (byte) iniInt2;

        // number overflow
        int intInt3 = 1000;
        byte iniByte3 = (byte) intInt3;
        // karena batas byte adalah 127,maka akan terulang ke -128  menuju 127 lagi sampai  hitungan
        //  1000 itu habis

    }
}

/*
konversi tipe data number :

- Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
- Narrowing Casting(Manual) : double -> float -> long -> int -> char -> short -> byte

 */
