package Sergey.OOP.task4;
//>класс далее
public class Item {
    //поля далее
    private String name;
    private int kolvo;
    private double price;
    private String corp;
    private int year;
    //конструктор далее
    public Item(String name, int kolvo, double price, String corp, int year) {
        this.name = name;
        this.kolvo = kolvo;
        this.price = price;
        this.corp = corp;
        this.year = year;
    }
    //геттер-сеттер далее
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
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
    // возвращает в sout данные, а не ссылку
    @Override
    public String toString() {
        return "Item{" +
                "Name='" + name + '\'' +
                ", kolvo=" + kolvo +
                ", price=" + price +
                ", corp='" + corp + '\'' +
                ", year=" + year +
                '}';
    }
}

