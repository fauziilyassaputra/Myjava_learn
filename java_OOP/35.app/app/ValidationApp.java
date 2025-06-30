package hollow.special.operation.app;

import hollow.special.operation.data.LoginRequest;
import hollow.special.operation.error.ValidationException;
import hollow.special.operation.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null,"....");

        // gunakan try catch untuk menggunakannya

        /*
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException exception){
            System.out.println("data tidak valid: " + exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println("data null: " + exception.getMessage());
        }
         */

        // jika ingin mengeluarkan output yang sama
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("data tidak valid: " + exception.getMessage());
        } // finally untuk hasil baik error ataupun success
        finally {
            System.out.println("selalu di eksekusi");
        }


    }
}
