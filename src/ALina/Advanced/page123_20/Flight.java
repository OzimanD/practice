package ALina.Advanced.page123_20;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {
    private int flightNum;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String direction;
    private String model;
    private double distance;

    public Flight(int flightNum, LocalDateTime departureTime, LocalDateTime arrivalTime, String direction, String model, double distance) {
        this.flightNum = flightNum;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.direction = direction;
        this.model = model;
        this.distance = distance;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNum=" + flightNum +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", direction='" + direction + '\'' +
                ", model='" + model + '\'' +
                ", distance=" + distance +
                '}';
    }
}
