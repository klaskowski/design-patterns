package designpatterns.exercises.observer;

import java.util.Observable;
import java.util.Observer;

public class Notification implements Observer {
    int counter = 0;
    @Override
    public void update(Observable o, Object arg) {
        counter ++;
        if(counter == 100) {
            System.out.println("Ładowanie zakończone");
        }
    }
}
