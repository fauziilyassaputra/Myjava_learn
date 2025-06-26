public class IfStatement {
    public static void main(String[] args) {

        int nilai = 90;
        int absen = 90;

        if(nilai >= 70 && absen >= 70){
            System.out.println("selamat anda lulus");
        } else {
            System.out.println("silahkan coba lagi tahun depan");
        }

        if(nilai >= 100 && absen >= 100){
            System.out.println("nilai anda S");
        } else if (nilai >= 90 && absen >= 90) {
            System.out.println("nilai anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("nilai anda B");
        } else {
            System.out.println("anda gagal");
        }


    }
}
