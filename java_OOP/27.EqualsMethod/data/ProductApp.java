package hollow.special.operation.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("asus ROG zepherus", 50_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        // cek apakah sama antara product dengan product2
        Product product2 = new Product("asus ROG zepherus", 50_000_000);
        System.out.println(product.equals(product2));  //true

        /*
        jika kita tidak menggunakan method  equals di file Product, maka hasilnya adalah  false. karena
        yang dibandingkan adalah memori, bukan outputnya.
         */

    }
}
