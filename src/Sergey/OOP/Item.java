package Sergey.OOP;

public class Item {
    private String prodavets;
    private String name;
    private int colvo;
    private double price;
    private int year;


    public Item(String prodavets, String name, int colvo, double price, int year) {
        this.prodavets = prodavets;
        this.name = name;
        this.colvo = colvo;
        this.price = price;
        this.year = year;
    }

    public String getProdavets() {
        return prodavets;
    }

    public void setProdavets(String prodavets) {
        this.prodavets = prodavets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColvo() {
        return colvo;
    }

    public void setColvo(int colvo) {
        this.colvo = colvo;
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

    @Override
    public String toString() {
        return "Item{" +
                "prodavets='" + prodavets + '\'' +
                ", name='" + name + '\'' +
                ", colvo=" + colvo +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
