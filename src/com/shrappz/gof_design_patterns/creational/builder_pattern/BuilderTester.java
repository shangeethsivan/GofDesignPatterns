package com.shrappz.gof_design_patterns.creational.builder_pattern;

/**
 * Created by Shangeeth on 27/07/18.
 */
public class BuilderTester {

    public static void main(String[] args){
        Computer computerWithoutGraphicsAndBluetooth = new Computer.ComputerBuilder("3TB","64GB").build();
        Computer computerWithGraphicsAndBluetooth = new Computer.ComputerBuilder("4TB","128GB")
                                                    .setBluetoothEnabled(true)
                                                    .setGraphicCardEnabled(true)
                                                    .build();


        System.out.println(computerWithoutGraphicsAndBluetooth.toString());
        System.out.println(computerWithGraphicsAndBluetooth.toString());

    }
}
