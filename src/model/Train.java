package model;

public class Train extends Vehicle {
    // Override Methods
    @Override
    public void start() {
        System.out.println("Train started");
    }

    @Override
    public void stop() {
        System.out.println("Train stopped");
    }

    @Override
    public double calculateFair() {
        double distance=getRoute().getDistance();
        return distance*3;
    }

    @Override
    public void details(){
        super.details();
        System.out.println("Train Fair: "+calculateFair());
    }

    // No Argument Constructor

    public Train() {
    }

    // All Argument Constructor
    public Train(String id, int capacity, double speed, Route route) {
        super(id, capacity, speed, route);
    }
}
