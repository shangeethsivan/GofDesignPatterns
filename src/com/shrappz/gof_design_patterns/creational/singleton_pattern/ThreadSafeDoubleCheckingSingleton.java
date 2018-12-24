package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 02/08/18.
 */
public class ThreadSafeDoubleCheckingSingleton {

    private ThreadSafeDoubleCheckingSingleton() {
    }

    private static ThreadSafeDoubleCheckingSingleton instance;

    public static ThreadSafeDoubleCheckingSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckingSingleton.class) {
                instance = new ThreadSafeDoubleCheckingSingleton();
            }
        }
        return instance;
    }
}
