public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b); // 110
        System.out.println(a - b); // 90
        System.out.println(a * b); // 1000
        System.out.println(a / b); // 10
        System.out.println(a % b); // 0

        // Augmented assignment
        /*
        a = a + 10      =>  a += 10
        a = a - 10      =>  a -= 10
        a = a * 10      =>  a *= 10
        a = a / 10      =>  a /= 10
        a = a % 10      =>  a %= 10
         */

        int c = 100;

//      c = c - 10;
//      System.out.println(c); //  90
        c -= 10;
        System.out.println(c); //  90


//  Unary Operator
    int d = 100;

    d++;
    System.out.println(d); // 101

    d--;
    System.out.println(d); // 100


  
    }
}
