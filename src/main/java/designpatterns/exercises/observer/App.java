package designpatterns.exercises.observer;

public class App {


    public static void main(String[] args) {
        FileLoader fl = new FileLoader();
        ProgressMeter pm = new ProgressMeter();
        Notification n = new Notification();
        fl.addObserver(pm);
        fl.addObserver(n);

        fl.startLoading();
    }
}
