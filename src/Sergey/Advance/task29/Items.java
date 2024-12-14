package Sergey.Advance.task29;

import java.time.LocalDate;

public class Items {
    private String name;
    private double price;
    private LocalDate ld_proizvedeno;
    private LocalDate ld_godnost;
    private int kolvo;
    private String proizvodutel;

    public Items(String name, double price, LocalDate ld_proizvedeno, LocalDate ld_godnost, int kolvo, String proizvodutel) {
        this.name = name;
        this.price = price;
        this.ld_proizvedeno = ld_proizvedeno;
        this.ld_godnost = ld_godnost;
        this.kolvo = kolvo;
        this.proizvodutel = proizvodutel;
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

    public LocalDate getLd_proizvedeno() {
        return ld_proizvedeno;
    }

    public void setLd_proizvedeno(LocalDate ld_proizvedeno) {
        this.ld_proizvedeno = ld_proizvedeno;
    }

    public LocalDate getLd_godnost() {
        return ld_godnost;
    }

    public void setLd_godnost(LocalDate ld_godnost) {
        this.ld_godnost = ld_godnost;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public String getProizvodutel() {
        return proizvodutel;
    }

    public void setProizvodutel(String proizvodutel) {
        this.proizvodutel = proizvodutel;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ld_proizvedeno=" + ld_proizvedeno +
                ", ld_godnost=" + ld_godnost +
                ", kolvo=" + kolvo +
                ", proizvodutel='" + proizvodutel + '\'' +
                '}';
    }
}
