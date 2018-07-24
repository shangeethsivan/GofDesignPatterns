package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
