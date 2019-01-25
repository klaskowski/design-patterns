package designpatterns.exercises.decorator;

public class BasicPasswordValidator implements Validable {
    public boolean isValid(String password){
        return password != null && !password.isEmpty();
    }
}
