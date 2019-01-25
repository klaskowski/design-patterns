package designpatterns.exercises.decorator;

public class RequiredDigitValidator implements Validable {
    Validable validator;

    public boolean isValid(String password){
        return validator.isValid(password) && password.matches(".*[0-9].*");
    }

    public RequiredDigitValidator(Validable validator) {
        this.validator = validator;
    }
}
