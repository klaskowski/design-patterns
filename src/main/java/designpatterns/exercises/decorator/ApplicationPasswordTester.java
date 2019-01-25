package designpatterns.exercises.decorator;

public class ApplicationPasswordTester {
    public static void main(String[] args) {
        Validable customValidator =
                new RequiredSpecialCharacterValidator(
                    new RequiredLengthValidator(
                        new RequiredDigitValidator(
                            new RequiredCapitalLetterValidator(
                                    new BasicPasswordValidator()
                            )
                        )
                    )
                );
        boolean isPasswordValid = customValidator.isValid("TestPassword1#$");
        System.out.println("isPasswordValid = " + isPasswordValid);
    }
}
