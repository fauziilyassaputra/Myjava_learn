public class BreakContinue {
    public static void main(String[] args) {
        var angka = 1;

        while (true){
            System.out.println("perulangan " + angka);
            angka++;

            if(angka > 10){
                break;
            }
        }

        // continue
        for(var counter =1; counter <= 100; counter++){
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("perulangan " + counter);
        }
    }
}

/*
- break digunakan untuk menghentikan seluruh perurangan
- sedangkan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke
perulangan selanjutnya
 */
