package com.shrappz.gof_design_patterns.creational.singleton_pattern;

/**
 * Created by Shangeeth on 02/08/18.
 */
public class BillPughSingleton {

    private BillPughSingleton(){};

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

}

// To avoid Eager initialization issue