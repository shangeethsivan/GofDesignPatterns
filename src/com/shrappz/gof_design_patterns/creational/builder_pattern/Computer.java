package com.shrappz.gof_design_patterns.creational.builder_pattern;

/**
 * Created by Shangeeth on 27/07/18.
 */
public class Computer {

    private String Hdd;

    private String Ram;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return Hdd;
    }

    public String getRam() {
        return Ram;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){
        Hdd = builder.Hdd;
        Ram = builder.Ram;
        isGraphicCardEnabled = builder.isGraphicCardEnabled;
        isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "*** Computer Specifications ***  \nHardDisk :"+getHdd()+"\nRam :"+getRam()+"\nIs Graphic Card Enabled :"+isGraphicCardEnabled()+"\nIs BluetoothEnabled :"+isBluetoothEnabled()+"\n\n";
    }

    public static class ComputerBuilder{

        private String Hdd;

        private String Ram;

        //Optional values
        private boolean isGraphicCardEnabled = false;
        private boolean isBluetoothEnabled = false;

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public ComputerBuilder(String hdd, String ram) {
            Hdd = hdd;
            Ram = ram;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
