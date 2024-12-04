package Sergey.Advance.task25;


import java.time.LocalDate;

public class Footbalist {
    private String lastname;
//    private int bd;
    private LocalDate bd;
    private String amplya;
    private int kolvoIgr;
    private int kolvoGolov;
    private String bdPlace;

    public Footbalist(String lastname, LocalDate bd, String amplya, int kolvoIgr, int kolvoGolov, String bdPlace) {
        this.lastname = lastname;
//        this.bd = bd;
        this.bd = bd;
        this.amplya = amplya;
        this.kolvoIgr = kolvoIgr;
        this.kolvoGolov = kolvoGolov;
        this.bdPlace = bdPlace;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBd() {
        return bd;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public String getAmplya() {
        return amplya;
    }

    public void setAmplya(String amplya) {
        this.amplya = amplya;
    }

    public int getKolvoIgr() {
        return kolvoIgr;
    }

    public void setKolvoIgr(int kolvoIgr) {
        this.kolvoIgr = kolvoIgr;
    }

    public int getKolvoGolov() {
        return kolvoGolov;
    }

    public void setKolvoGolov(int kolvoGolov) {
        this.kolvoGolov = kolvoGolov;
    }

    public String getBdPlace() {
        return bdPlace;
    }

    public void setBdPlace(String bdPlace) {
        this.bdPlace = bdPlace;
    }

    @Override
    public String toString() {
        return "Footbalist{" +
                "lastname='" + lastname + '\'' +
                ", bd=" + bd +
                ", amplya='" + amplya + '\'' +
                ", kolvoIgr=" + kolvoIgr +
                ", kolvoGolov=" + kolvoGolov +
                ", bdPlace='" + bdPlace + '\'' +
                '}';
    }
}
