package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class LazyInitSingleton {

    private LazyInitSingleton() {
    }

    private static LazyInitSingleton instance;

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
