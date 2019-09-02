package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    //has-a relationship (agregare)
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
