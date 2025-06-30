package hollow.special.operation.util;

import hollow.special.operation.data.LoginRequest;
import hollow.special.operation.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("password is blank");
        }
    }
}
