package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class EagerInitSingleton
{
    private EagerInitSingleton(){}

    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    public static EagerInitSingleton getInstance(){
        return INSTANCE;
    }
}
