package model;

/*
* Abstract parent class Vehicle
 */
public abstract class Vehicle {
    private String id;
    private int capacity;
    private double speed;
    private Route route;

    // No Argument Constructor
    public Vehicle() {
    }

    // All Argument Constructor
    public Vehicle(String id, int capacity, double speed, Route route) {
        this.id = id;
        this.capacity = capacity;
        this.speed = speed;
        this.route = route;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    // methods of Vehicle class
    public abstract void start();
    public abstract void stop();
    public abstract double calculateFair();

    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed);
        System.out.println("Route: " + route);
    }
}
