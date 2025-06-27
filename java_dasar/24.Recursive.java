public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    // tanpa recursive method
    static int factorialLoop(int value) {
        var result = 1;

        for (var counter =1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }


    // dengan recursive method
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

}

/*
-walaupun recursive method sangat menarik, namun perlu hati-hati dalam menggunakannya
-jika recursive terlalu dalam, maka akan ada kemungknan terjadi stack overflow, yaitu error dimana stack method
terlalu banyak di java
 */
