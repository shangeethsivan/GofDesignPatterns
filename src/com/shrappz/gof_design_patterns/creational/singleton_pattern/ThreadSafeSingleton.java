package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
