package designpatterns.exercises.decorator;

public class RequiredLengthValidator implements Validable {
    Validable validator;

    public boolean isValid(String password){
        return validator.isValid(password) && password.length() >= 8;
    }

    public RequiredLengthValidator(Validable validator) {
        this.validator = validator;
    }
}
