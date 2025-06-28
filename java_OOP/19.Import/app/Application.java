package hollow.special.operation.app;


import hollow.special.operation.data.Product;


public class Application {
    public static void main(String[] args) {

        Product product = new Product("asus ROG zepherus", 50_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}

/*
- import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
- syarat class yang bisa digunakan jika packagenya berbeda adalah class yang harus public

 */
