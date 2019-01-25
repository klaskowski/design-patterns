package designpatterns.exercises.decorator;

public class RequiredSpecialCharacterValidator implements Validable {
    Validable validator;

    public boolean isValid(String password){
        return validator.isValid(password) && password.matches(".*[!@#$%^&*].*");
    }

    public RequiredSpecialCharacterValidator(Validable validator) {
        this.validator = validator;
    }
}
