package com.realdolmen.ood020.factorymethod;

/**
 * Created by vdabcursist on 11/08/2017.
 */


public interface VehicleFactory {
    Vehicle createVehicle(boolean type, int noPassengers,
                          String reg, int berths);

}
