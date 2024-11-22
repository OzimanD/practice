package Sergey.Advance.task18;

public class Corp {
    private String name;
    private double price;
    private int year;
    private int srokGodnosti;
    private int kolvo;
    private String corp;

    public Corp(String name, double price, int year, int srokGodnosti, int kolvo, String corp) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.srokGodnosti = srokGodnosti;
        this.kolvo = kolvo;
        this.corp = corp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSrokGodnosti() {
        return srokGodnosti;
    }

    public void setSrokGodnosti(int srokGodnosti) {
        this.srokGodnosti = srokGodnosti;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    @Override
    public String toString() {
        return "Corp{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", srokGodnosti=" + srokGodnosti +
                ", kolvo=" + kolvo +
                ", corp='" + corp + '\'' +
                '}';
    }
}
