package hollow.special.operation.util;

public class MathUtil {

    // Static method

    public static int sum(int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }
        return total;
    }
}

