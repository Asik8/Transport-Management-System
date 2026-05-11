package model;

public class Taxi extends Vehicle {

    // Override Methods
    @Override
    public void start() {
        System.out.println("Taxi is started");
    }

    @Override
    public void stop() {
        System.out.println("Taxi is stopped");
    }

    @Override
    public double calculateFair() {
        double distance = getRoute().getDistance();
        return 50+(distance*15);
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("Total Fair: "+calculateFair());
    }

    // No Argument Constructor
    public Taxi() {
    }

    // All Argument Constructor
    public Taxi(String id, int capacity, double speed, Route route) {
        super(id, capacity, speed, route);
    }
}
