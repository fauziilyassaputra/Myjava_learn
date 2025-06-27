public class DoWhileLoop {
    public static void main(String[] args) {

        var counter = 100;

        do {
            System.out.println("perulangan " + counter);
            counter++;
        } while (counter <= 10);

    }
}

/*

- Do ehile loop adalah perulangan yang mirip dengan while
- Perbedaannya hanya pada pengecekan kondisi
- pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop
 dilakukan setelah perulangan dilakukan
 - oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true

 */
