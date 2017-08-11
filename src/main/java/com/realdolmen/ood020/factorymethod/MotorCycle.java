package com.realdolmen.ood020.factorymethod;

public class MotorCycle extends Vehicle {

    protected int noPassengers;
    protected String regNo;

    public MotorCycle(int p, String r, int b) {
        super(p, r);
        noPassengers = b;
    }

    public int getSize() {
        return 1;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getNoPass() {
        return noPassengers;
    }

    public int getCost() {
        return Ferry.VEHICLE_COST + (Ferry.PASSENGER_COST * noPassengers);
    }

}
