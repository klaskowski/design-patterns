package designpatterns.examples.observer;

import java.util.Observer;

public class FizzCounter implements Observer {
    int counter = 0;
    @Override
    public void update(java.util.Observable o, Object arg) {
        ++counter;
        if(counter % 3 == 0) System.out.println("Fizz");
    }
}
