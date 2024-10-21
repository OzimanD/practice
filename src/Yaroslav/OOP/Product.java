package Yaroslav.OOP;

public class Product {

    // поля класу

    private String name;
    private int quantity;
    private double price;
    private String producer;
    private String datetime;

    // конструктор

    public Product(String name, int quantity, double price,
                   String producer, String datetime) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.producer = producer;
        this.datetime = datetime;
    }

    // методи класу

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
