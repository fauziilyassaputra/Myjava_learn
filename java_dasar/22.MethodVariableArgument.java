public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {85,75,50,45,75};
        sayCongrats("corin", values);

        // bisa memasukkan value berapapun tanpa harus membut array terlebih dahulu
        sayCongrats2("rina", 85,80,95,40,84);

    }

    // tanpa variable argument
    static void  sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("selamat " + name + ", anda lulus");
        } else {
            System.out.println("maaf " + name + ", anda tidak lulus");
        }
    }

    // dengan variable argument
    static void  sayCongrats2(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("selamat " + name + ", anda lulus");
        } else {
            System.out.println("maaf " + name + ", anda tidak lulus");
        }
    }



}
