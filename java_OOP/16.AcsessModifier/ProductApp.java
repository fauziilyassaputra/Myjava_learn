package hollow.special.operation.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("asus ROG zepherus", 50_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}
