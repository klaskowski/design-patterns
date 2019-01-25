package designpatterns.exercises.singleton;

public class User {
    private String name;
    private boolean gdprAgreed;

    public User(String name) {
        this.name = name;
        Logger.INSTANCE.warn("User created, no GDPR agreement so far.");
    }

    public void setGdprAgreed(boolean gdprAgreed) {
        this.gdprAgreed = gdprAgreed;
    }

    public boolean isGdprAgreed() {
        return gdprAgreed;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gdprAgreed=" + gdprAgreed +
                '}';
    }
}
