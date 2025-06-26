public class OperasiBoolean {
    public static void main(String[] args) {

        // &&
        int absen = 78;
        int nilaiAkhir = 90;

        boolean lulusAbsen = absen >= 70;
        boolean lulusNilai = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus); // true

    }
}

/*
penjelasan :

1. operasi &&
- true && true  => true
- true && false => false
- false && true =>  false
- false && false => false

- !true => false
- !false => true



 */
