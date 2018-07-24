package com.shrappz.gof_design_patterns.creational.factory_pattern;

/**
 * Created by Shangeeth on 24/07/18.
 */
public class FactoryTest {

    public static void main(String[] args){
        Vehicle auto = VehicleFactory.getVehicle("auto","Bajaj","RE100",2007);
        Vehicle bike = VehicleFactory.getVehicle("bike","Yamaha","R1",2018);
        Vehicle car = VehicleFactory.getVehicle("car","Lamborghini","Veneno",2014);

        System.out.println("Factory Vehicle Car Details \n"+car.toString());
        System.out.println("\n\nFactory Vehicle Auto Details \n"+auto.toString());
        System.out.println("\n\nFactory Vehicle Bike Details \n"+bike.toString());

    }
}
