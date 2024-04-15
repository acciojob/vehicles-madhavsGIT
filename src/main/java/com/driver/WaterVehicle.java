package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat{
    String name;
    int capacity;

    public String getVehicleName(String name){
        this.name = name;
        return name;
    }
    public int getVehicleCapacity(int cap){
        this.capacity = cap;
        return cap;
    }
}