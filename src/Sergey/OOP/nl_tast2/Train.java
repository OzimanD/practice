package Sergey.OOP.nl_tast2;

import java.util.Arrays;

public class Train {
    private int id_tr;
    private String n_pribitiya;
    private int h_pribitiya;
    private String n_otbytiya;
    private int h_otbytiya;

    public Train(int id_tr, String n_pribitiya, int h_pribitiya, String n_otbytiya, int h_otbytiya) {
        this.id_tr = id_tr;
        this.n_pribitiya = n_pribitiya;
        this.h_pribitiya = h_pribitiya;
        this.n_otbytiya = n_otbytiya;
        this.h_otbytiya = h_otbytiya;
    }

    public int getId_tr() {
        return id_tr;
    }

    public void setId_tr(int id_tr) {
        this.id_tr = id_tr;
    }

    public String getN_pribitiya() {
        return n_pribitiya;
    }

    public void setN_pribitiya(String n_pribitiya) {
        this.n_pribitiya = n_pribitiya;
    }

    public int getH_pribitiya() {
        return h_pribitiya;
    }

    public void setH_pribitiya(int h_pribitiya) {
        this.h_pribitiya = h_pribitiya;
    }

    public String getN_otbytiya() {
        return n_otbytiya;
    }

    public void setN_otbytiya(String n_otbytiya) {
        this.n_otbytiya = n_otbytiya;
    }

    public int getH_otbytiya() {
        return h_otbytiya;
    }

    public void setH_otbytiya(int h_otbytiya) {
        this.h_otbytiya = h_otbytiya;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id_tr=" + id_tr +
                ", n_pribitiya='" + n_pribitiya + '\'' +
                ", h_pribitiya=" + h_pribitiya +
                ", n_otbytiya='" + n_otbytiya + '\'' +
                ", h_otbytiya=" + h_otbytiya +
                '}';
    }
}
