package ALina.OOP.page120_task29;

public class Goods {
    private int quantity;
    private double price;
    private int year;
    private String manufacturer;

    public Goods(int quantity, double price, int year, String manufacturer) {
        this.quantity = quantity;
        this.price = price;
        this.year = year;
        this.manufacturer = manufacturer;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
