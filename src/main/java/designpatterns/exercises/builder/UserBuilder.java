package designpatterns.exercises.builder;

public class UserBuilder {
    User user;
    public UserBuilder(String name, String surname) {
        user = new User(name, surname);
    }

    public UserBuilder setAge(int age){
        user.setAge(age);
        return this;
    }

    public UserBuilder setPhone(String phone){
        user.setPhone(phone);
        return this;
    }

    public UserBuilder setAddress(String address){
        user.setAddress(address);
        return this;
    }

    public User build() {
        return user;
    }
}
