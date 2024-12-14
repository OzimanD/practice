package Sergey.Advance.task30;

import java.time.LocalDate;

public class Car {
    private String name;
    private String proizvoditel;
    private String type;
    private LocalDate vipusk;
    private LocalDate techOsmotr;
    private LocalDate registerDate;

    public Car(String name, String proizvoditel, String type, LocalDate vipusk, LocalDate techOsmotr, LocalDate registerDate) {
        this.name = name;
        this.proizvoditel = proizvoditel;
        this.type = type;
        this.vipusk = vipusk;
        this.techOsmotr = techOsmotr;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getVipusk() {
        return vipusk;
    }

    public void setVipusk(LocalDate vipusk) {
        this.vipusk = vipusk;
    }

    public LocalDate getTechOsmotr() {
        return techOsmotr;
    }

    public void setTechOsmotr(LocalDate techOsmotr) {
        this.techOsmotr = techOsmotr;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", proizvoditel='" + proizvoditel + '\'' +
                ", type='" + type + '\'' +
                ", vipusk=" + vipusk +
                ", techOsmotr=" + techOsmotr +
                ", registerDate=" + registerDate +
                '}';
    }
}
