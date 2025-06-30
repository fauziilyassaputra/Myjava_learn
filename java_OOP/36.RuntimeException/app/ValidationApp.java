package hollow.special.operation.app;

import hollow.special.operation.data.LoginRequest;
import hollow.special.operation.error.ValidationException;
import hollow.special.operation.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null,"....");


        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("data tidak valid: " + exception.getMessage());
        } // finally untuk hasil baik error ataupun success
        finally {
            System.out.println("selalu di eksekusi");
        }

        //memanggil ValidateRuntime (tidak harus try catch)
        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRunTime(loginRequest1);
        /*
        - walaupun runtime exception tidak wajib di try catch, tapi ada baiknya tetap dilakukan
        - karena jika terjadi runtime exception, yang ditakutkan program kita akan berhenti
         */

    }
}
