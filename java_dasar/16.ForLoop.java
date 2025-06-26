public class ForLoop {
    public static void main(String[] args) {

        var counter = 1;

        for (;counter <= 10;){
            System.out.println("perulangan" + counter);
            counter++;
        }

        // perulangan dengan init statement

        for (var counter2 = 1 ;counter2 <= 10;counter2++){
            System.out.println("perulangan" + counter2);
        }
    }
}
