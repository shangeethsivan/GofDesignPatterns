package com.shrappz.gof_design_patterns.creational.abstract_factory_pattern;


/**
 * Created by Shangeeth on 24/07/18.
 */
public class FactoryTest {

    public static void main(String[] args){
        Vehicle auto = VehicleFactory.getVehicle(new AutoFactory("Bajaj","RE100",2007));
        Vehicle bike = VehicleFactory.getVehicle(new BikeFactory("Yamaha","R1",2018));
        Vehicle car = VehicleFactory.getVehicle(new CarFactory("Lamborghini","Veneno",2014));

        System.out.println("Factory Vehicle Car Details \n"+car.toString());
        System.out.println("\n\nFactory Vehicle Auto Details \n"+auto.toString());
        System.out.println("\n\nFactory Vehicle Bike Details \n"+bike.toString());

    }
}
