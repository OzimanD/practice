package Mamontoboi.Task18;

public class Item {
    private String name;
    private String manufacturer;
    private int year;
    private int quantity;
    private int price;

    public Item(String name, String manufacturer, int year, int quantity, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
