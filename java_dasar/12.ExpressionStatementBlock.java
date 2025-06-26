public class ExspressionStatementBlock {
    public static void main(String[] args) { //blok pertama


        // assigment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        //method invocation statement
        System.out.println("hello world");
        // object creation statement
        
        {     // blok ke dua
            System.out.println("hello world 2");
        }

    }
}

/*
Expression :
- adalah konstruksi dari variable, operator, dan pemanggilan method yang mengevaluasikan menjadi sebuah
single value
-expression adalah core compoment dari statement

statement :
- kumpulan dari beberapa ekspression
- biasanya diakhiri dengan titik koma
- ada beberapa jenis statement :
    - assigment expression
    - penggunaan ++ dan --;
    - method invocation
    - object creation expression

Block :
- block adalah kumpulan statement yang terdiri dari nol atau lebih statement
- Block diawali dan diakhiri dengan kurung kurawal {}
 */
