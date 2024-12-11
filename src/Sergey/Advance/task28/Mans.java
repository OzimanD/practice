package Sergey.Advance.task28;

import java.time.LocalDate;

public class Mans {
    private String lastName;
    private String name;
    private String surName;
    private String doljnost;
    private String pol;
    private LocalDate ldPriem;

    public Mans(String lastName, String name, String surName, String doljnost, String pol, LocalDate ldPriem) {
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.doljnost = doljnost;
        this.pol = pol;
        this.ldPriem = ldPriem;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public LocalDate getLdPriem() {
        return ldPriem;
    }

    public void setLdPriem(LocalDate ldPriem) {
        this.ldPriem = ldPriem;
    }

    @Override
    public String toString() {
        return "Mans{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", doljnost='" + doljnost + '\'' +
                ", pol='" + pol + '\'' +
                ", ldPriem=" + ldPriem +
                '}';
    }
}
