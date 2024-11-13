package Sergey.OOP.task25;

public class Item {
    private int kolvo;
    private double price;
    private int year;
    private String marka;

    public Item(int kolvo, double price, int year, String marka) {
        this.kolvo = kolvo;
        this.price = price;
        this.year = year;
        this.marka = marka;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Item{" +
                "kolvo=" + kolvo +
                ", price=" + price +
                ", year=" + year +
                ", marka='" + marka + '\'' +
                '}';
    }
}
