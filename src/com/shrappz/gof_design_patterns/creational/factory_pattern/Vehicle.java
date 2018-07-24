package com.shrappz.gof_design_patterns.creational.factory_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public abstract class Vehicle {

    public abstract int getNoOfWheels();
    public abstract String getVehicleManufacturer();
    public abstract String getVehicleModel();
    public abstract int getYearOfMake();


    @Override
    public String toString() {
        return "Vehicle details \nManufacturer and Model : "+getVehicleManufacturer() +" : "+getVehicleModel()+"\nYear :"+getYearOfMake()+"\nNo of Wheels:"+getNoOfWheels();
    }
}
