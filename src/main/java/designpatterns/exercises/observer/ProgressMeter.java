package designpatterns.exercises.observer;

import java.util.Observable;
import java.util.Observer;

public class ProgressMeter implements Observer {
    int counter = 0;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Ładowanie: " + counter++ + "%");
    }
}
