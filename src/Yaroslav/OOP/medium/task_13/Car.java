package Yaroslav.OOP.medium.task_13;

public class Car {

    private String brand;
    private String producer;
    private double carryingCapacity;
    private int yearOfIssue;
    private int yearOfRegistration;

    public Car(String brand, String producer, double carryingCapacity, int yearOfIssue, int yearOfRegistration) {
        this.brand = brand;
        this.producer = producer;
        this.carryingCapacity = carryingCapacity;
        this.yearOfIssue = yearOfIssue;
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", producer='" + producer + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", yearOfIssue=" + yearOfIssue +
                ", yearOfRegistration=" + yearOfRegistration +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }
}
