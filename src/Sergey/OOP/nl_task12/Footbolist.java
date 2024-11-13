package Sergey.OOP.nl_task12;

public class Footbolist {
    private String surname;
    private int bd;
    private String palce_db;
    private String amplua;
    private int kolvo_igr;
    private int kolov_kard;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBd() {
        return bd;
    }

    public void setBd(int bd) {
        this.bd = bd;
    }

    public String getPalce_db() {
        return palce_db;
    }

    public void setPalce_db(String palce_db) {
        this.palce_db = palce_db;
    }

    public String getAmplua() {
        return amplua;
    }

    public void setAmplua(String amplua) {
        this.amplua = amplua;
    }

    public int getKolvo_igr() {
        return kolvo_igr;
    }

    public void setKolvo_igr(int kolvo_igr) {
        this.kolvo_igr = kolvo_igr;
    }

    public int getKolov_kard() {
        return kolov_kard;
    }

    public void setKolov_kard(int kolov_kard) {
        this.kolov_kard = kolov_kard;
    }

    @Override
    public String toString() {
        return "Footbolist{" +
                "surname='" + surname + '\'' +
                ", bd=" + bd +
                ", palce_db='" + palce_db + '\'' +
                ", amplua='" + amplua + '\'' +
                ", kolvo_igr=" + kolvo_igr +
                ", kolov_kard=" + kolov_kard +
                '}';
    }

    public Footbolist(String surname, int bd, String palce_db, String amplua, int kolvo_igr, int kolov_kard) {
        this.surname = surname;
        this.bd = bd;
        this.palce_db = palce_db;
        this.amplua = amplua;
        this.kolvo_igr = kolvo_igr;
        this.kolov_kard = kolov_kard;


    }
}
