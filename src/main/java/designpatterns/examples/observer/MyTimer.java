package designpatterns.examples.observer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends Observable {
    private final Timer t = new Timer();

    public void start() {
        final TimerTask task = new TimerTask() {
            public void run() {
                setChanged();
                notifyObservers();
                start();
            }
        };
        t.schedule(task, 1000);
    }
}
