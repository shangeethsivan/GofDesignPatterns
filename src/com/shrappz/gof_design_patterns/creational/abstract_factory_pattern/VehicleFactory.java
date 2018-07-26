package com.shrappz.gof_design_patterns.creational.abstract_factory_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(VehicleAbstractFactory factory){
        return factory.createVehicle();
    }
}
