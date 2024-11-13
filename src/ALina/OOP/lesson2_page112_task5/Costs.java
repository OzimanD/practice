package ALina.OOP.lesson2_page112_task5;

public class Costs {
    private String name;
    private String manufacturer;
    private int yearOfIssue;
    private int quantity;
    private double price;

    public Costs(double price, int quantity, int yearOfIssue, String manufacturer, String name) {
        this.price = price;
        this.quantity = quantity;
        this.yearOfIssue = yearOfIssue;
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Costs{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
