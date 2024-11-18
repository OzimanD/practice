package ALina.OOP.page121_11;

public class Product {
    private String name;
    private int manufactureDate;
    private int shelfLifeInDays;
    private double price;
    private int seriesNumber;

    public Product(String name, int manufactureDate, int shelfLifeInDays, double price, int seriesNumber) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.shelfLifeInDays = shelfLifeInDays;
        this.price = price;
        this.seriesNumber = seriesNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", shelfLifeInDays=" + shelfLifeInDays +
                ", price=" + price +
                ", seriesNumber=" + seriesNumber +
                '}';
    }
}
