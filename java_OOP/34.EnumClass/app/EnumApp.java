package hollow.special.operation.app;

import hollow.special.operation.data.Customer;
import hollow.special.operation.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer  customer = new Customer();
        customer.setName("hoshimi");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //konversi dari enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konversi dari string ke enum
        Level level = Level.valueOf("PREMIUM"); // akan error jika memasukkan data tidak sama
        System.out.println(level);

        //mengecek jumlah enum ada berapa (menggunakan foreach)
        System.out.println("print level :");
        for(var value: Level.values()){
            System.out.println(value);
        }

    }
}
