package designpatterns.examples.singleton;

public class ThreadSafeEfficientSingleton {
    private volatile static ThreadSafeEfficientSingleton INSTANCE;

    private ThreadSafeEfficientSingleton() {}

    public static ThreadSafeEfficientSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (ThreadSafeEfficientSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeEfficientSingleton();
                }
            }
        }
        return INSTANCE;
    }

    // -----------

//    private double footprint;
//
//    private ThreadSafeEfficientSingleton() {
//        footprint = Math.random();
//    }
//
//    public void getFootprint() {
//        System.out.println("footprint = " + footprint);
//    }
}
