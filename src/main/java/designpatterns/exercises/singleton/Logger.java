package designpatterns.exercises.singleton;

public enum Logger {
    INSTANCE;
    public void error(String message) {
        System.out.println("#ERROR - " + message);
    }

    public void warn(String message) {
        System.out.println("#WARN - " + message);
    }

    public void info(String message) {
        System.out.println("#INFO - " + message);
    }
}
