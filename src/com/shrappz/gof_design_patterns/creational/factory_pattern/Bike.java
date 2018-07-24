package com.shrappz.gof_design_patterns.creational.factory_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class Bike extends Vehicle {

    int mNoOfWheels = 2, mYearOfMake;
    String mManufacturerName, mVehicleModel;

    public Bike(String mManufacturerName, String mVehicleModel, int mYearOfMake) {
        this.mYearOfMake = mYearOfMake;
        this.mManufacturerName = mManufacturerName;
        this.mVehicleModel = mVehicleModel;
    }

    @Override
    public int getNoOfWheels() {
        return mNoOfWheels;
    }

    @Override
    public String getVehicleManufacturer() {
        return mManufacturerName;
    }

    @Override
    public String getVehicleModel() {
        return mVehicleModel;
    }

    @Override
    public int getYearOfMake() {
        return mYearOfMake;
    }
}
