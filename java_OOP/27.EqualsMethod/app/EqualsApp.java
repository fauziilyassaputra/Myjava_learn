package hollow.special.operation.app;

import hollow.special.operation.data.Product;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "hoshimi";
        first = first + " " + "miyabi";
        System.out.println(first);

        String second = "hoshimi miyabi";
        System.out.println(second);

        System.out.println(first == second); // false meskipun outputnya sama
        System.out.println(first.equals(second)); //true

        String third =  "hoshimi miyabi";

        System.out.println(second == third);;//true
        System.out.println(second.equals(third)); //true
    }


        
    }

