package ALina.Advanced.page122_17;

public class Avia {
    private String name;
    private  int  productionYear;
    private  int  expiryYear;
    private  double price;
    private  String number;

    public Avia(String name, int productionYear, int expiryYear, double price, String number) {
        this.name = name;
        this.productionYear = productionYear;
        this.expiryYear = expiryYear;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Avia{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", expiryYear=" + expiryYear +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
