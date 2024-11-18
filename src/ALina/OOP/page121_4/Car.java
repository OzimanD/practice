package ALina.OOP.page121_4;

public class Car {
    private String brand;
    private String manufacturer;
    private String type;
    private int year;
    private int registrationDate;

    public Car(String brand, String manufacturer, String type, int year, int registrationDate) {
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.registrationDate = registrationDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
