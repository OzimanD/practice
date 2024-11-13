package Sergey.OOP.ln_task6;

public class Train {
    private int id_t;
    private int t_pribitiya;
    private int t_otbitiya;
    private String napravlenie;
    private int rasstoyanie;

    public Train(int id_t, int t_pribitiya, int t_otbitiya, String napravlenie, int rasstoyanie) {
        this.id_t = id_t;
        this.t_pribitiya = t_pribitiya;
        this.t_otbitiya = t_otbitiya;
        this.napravlenie = napravlenie;
        this.rasstoyanie = rasstoyanie;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public int getT_pribitiya() {
        return t_pribitiya;
    }

    public void setT_pribitiya(int t_pribitiya) {
        this.t_pribitiya = t_pribitiya;
    }

    public int getT_otbitiya() {
        return t_otbitiya;
    }

    public void setT_otbitiya(int t_otbitiya) {
        this.t_otbitiya = t_otbitiya;
    }

    public String getNapravlenie() {
        return napravlenie;
    }

    public void setNapravlenie(String napravlenie) {
        this.napravlenie = napravlenie;
    }

    public int getRasstoyanie() {
        return rasstoyanie;
    }

    public void setRasstoyanie(int rasstoyanie) {
        this.rasstoyanie = rasstoyanie;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id_t=" + id_t +
                ", t_pribitiya=" + t_pribitiya +
                ", t_otbitiya=" + t_otbitiya +
                ", napravlenie='" + napravlenie + '\'' +
                ", rasstoyanie=" + rasstoyanie +
                '}';
    }
}
