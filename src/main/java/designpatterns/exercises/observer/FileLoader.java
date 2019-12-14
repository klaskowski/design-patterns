package designpatterns.exercises.observer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class FileLoader extends Observable {
    Timer t = new Timer();

    public void startLoading() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                setChanged();
                notifyObservers();
                startLoading();
            }
        };
        t.schedule(timerTask, 0 + (int)(Math.random() * 200));
    }
}
