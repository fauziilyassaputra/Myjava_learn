package hollow.special.operation.app;

public class StackTraceApp {
    public static void main(String[] args) {

        // memanggil multiple StackTraceElement
        try{
            sampleError();
        } catch (RuntimeException exception){
            exception.printStackTrace();
        }

        // StackTraceElement biasa
        /*
         try {
            String[] names = {
                    "trigger","sanby","harin"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
         */


    }

    // multiple StackTraceElement
    public static void sampleError(){
        try {
            String[] names = {
                    "trigger","sanby","harin"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }


    }
}
