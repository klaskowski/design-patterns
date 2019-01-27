package designpatterns.examples.observer;

import java.util.Observable;
import java.util.Observer;

public class Counter implements Observer {
    int counter = 0;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("counter = " + ++counter);
    }
}
