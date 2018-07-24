package com.shrappz.gof_design_patterns.creational.factory_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(String type,String manufacturer,String model,int yearOfMake){

        switch (type){
            case "bike":
                return new Bike(manufacturer,model,yearOfMake);

            case "auto":
                return new Auto(manufacturer,model,yearOfMake);

            case "car":
                return new Car(manufacturer,model,yearOfMake);
        }

        return null;
    }
}
