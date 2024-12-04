package Sergey.Advance.task19;

import java.time.LocalDate;

public class Footbolist {
    private String lastname;
    private int birthday;
    private String club;
    private String amplya;
    private int kolvoIgr;
    private String mestoRojdeniya;

    public Footbolist(String lastname, int birthday, String club, String amplya, int kolvoIgr, String mestoRojdeniya) {
        this.lastname = lastname;
        this.birthday = birthday;
        this.club = club;
        this.amplya = amplya;
        this.kolvoIgr = kolvoIgr;
        this.mestoRojdeniya = mestoRojdeniya;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
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

    public String getMestoRojdeniya() {
        return mestoRojdeniya;
    }

    public void setMestoRojdeniya(String mestoRojdeniya) {
        this.mestoRojdeniya = mestoRojdeniya;
    }

    @Override
    public String toString() {
        return "Footbolist{" +
                "lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", club='" + club + '\'' +
                ", amplya='" + amplya + '\'' +
                ", kolvoIgr=" + kolvoIgr +
                ", mestoRojdeniya='" + mestoRojdeniya + '\'' +
                '}';
    }
}
