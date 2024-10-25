package Sergey.OOP.task9;

public class Item {
    private String names;
    private int kolvo;
    private double price;
    private String corp;
    private int year;

    public Item(String names, int kolvo, double price, String corp, int year) {
        this.names = names;
        this.kolvo = kolvo;
        this.price = price;
        this.corp = corp;
        this.year = year;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
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
                "names='" + names + '\'' +
                ", kolvo=" + kolvo +
                ", price=" + price +
                ", corp='" + corp + '\'' +
                ", year=" + year +
                '}';
    }
}

