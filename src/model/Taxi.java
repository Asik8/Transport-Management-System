package model;

public class Taxi extends Vehicle {

    // No Argument Constructor
    public Taxi() {
    }

    // All Argument Constructor
    public Taxi(String id, int capacity, double speed, Route route) {
        super(id, capacity, speed, route);
    }
}
