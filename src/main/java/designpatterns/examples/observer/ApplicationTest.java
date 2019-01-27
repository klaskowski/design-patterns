package designpatterns.examples.observer;

public class ApplicationTest {
    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        Counter counter = new Counter();
        FizzCounter counter2 = new FizzCounter();
        timer.addObserver(counter);
        timer.addObserver(counter2);
        timer.start();
    }
}
