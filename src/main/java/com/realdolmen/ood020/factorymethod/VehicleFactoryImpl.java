package com.realdolmen.ood020.factorymethod;

import java.util.ArrayList;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class VehicleFactoryImpl implements VehicleFactory {

    public Vehicle createVehicle(boolean type, int noPassengers,
                                 String reg, int berths) {
        if(type) {
            return new Vehicle(noPassengers, reg);

            } else {
                return new Truck(noPassengers, reg, berths);
            }
        }

    }