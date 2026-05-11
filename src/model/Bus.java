package model;

public class Bus extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bus is started");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopped");
    }

    @Override
    public double calculateFair() {
        double distance=getRoute().getDistance();
        return distance*2.5;
    }

    // No Argument Constructor
    public Bus() {
    }

    // All Argument Constructor
    public Bus(String id, int capacity, double speed, Route route) {
        super(id, capacity, speed, route);
    }


}
