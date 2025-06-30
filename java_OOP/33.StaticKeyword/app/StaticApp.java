package hollow.special.operation.app;
import hollow.special.operation.data.Application;
import hollow.special.operation.data.Country;
import hollow.special.operation.util.MathUtil;

// static import
import static hollow.special.operation.data.Constant.*;


public class StaticApp {
    public static void main(String[] args) {

        // memanggil static field
        System.out.println(APPLICATION); // tidak perlu lagi Constant.APPLICATION
        System.out.println(VERSION);

        // memanggil static method
        System.out.println(MathUtil.sum(1,1,1,1,1));

        //memanggil static innerclass
        Country.City city = new Country.City();
        city.setName("hoshimi");
        System.out.println(city.getName());


        // memanggil static block
        System.out.println(Application.PROCESSORS);

    }
}
