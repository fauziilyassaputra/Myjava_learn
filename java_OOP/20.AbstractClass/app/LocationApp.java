package hollow.special.operation.app;

import hollow.special.operation.data.City;
import hollow.special.operation.data.Location;

public class LocationApp {
    public static void main(String[] args) {

//        var location = new Location(); // ERROR karena Location adalah abstract class

          var city = new City();
          city.name = "jakarta";
          System.out.println(city.name);

    }
}

/*
- abstract class artinya, class tersebut tidak bisa dibuat object secara langsung, hanya bisa diturunkan
- untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata kunci class
- dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child
 */
