public class MethodReturnValue {
    public static void main(String[] args) {

        var result = sum(100, 100);
        System.out.println(result);

        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(5000,"-",1000));

    }
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return  value1 - value2;
            default:
                return 0;
        }
    }
}


/*
- agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
- untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
- di java, kita hanya bisa menghasilkan data di sebuah method, tidak bisa lebih dari satu
 */
