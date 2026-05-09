package model;

public class Route {
    private String routeId;
    private String startPoint;
    private String endPoint;
    private int distance;

    // No Argument Constructor
    public Route() {
    }

    // All Argument Constructor
    public Route(String routeId, String startPoint, String endPoint, int distance) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.distance = distance;
    }

    // Getters and Setters
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
