package com.driver;

public interface WaterVehicle {
    public String getVehicleName();

    public int getVehicleCapacity();

}

class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return "";
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }




}