package Sergey.OOP.nl_task15;

public class Train {
    private int id;
    private String napravlenie;
    private int t_pribitiya;
    private int t_otpravleniya;
    private int rastoyanie;

    public Train(int id, String napravlenie, int t_pribitiya, int t_otpravleniya, int rastoyanie) {
        this.id = id;
        this.napravlenie = napravlenie;
        this.t_pribitiya = t_pribitiya;
        this.t_otpravleniya = t_otpravleniya;
        this.rastoyanie = rastoyanie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNapravlenie() {
        return napravlenie;
    }

    public void setNapravlenie(String napravlenie) {
        this.napravlenie = napravlenie;
    }

    public int getT_pribitiya() {
        return t_pribitiya;
    }

    public void setT_pribitiya(int t_pribitiya) {
        this.t_pribitiya = t_pribitiya;
    }

    public int getT_otpravleniya() {
        return t_otpravleniya;
    }

    public void setT_otpravleniya(int t_otpravleniya) {
        this.t_otpravleniya = t_otpravleniya;
    }

    public int getRastoyanie() {
        return rastoyanie;
    }

    public void setRastoyanie(int rastoyanie) {
        this.rastoyanie = rastoyanie;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", napravlenie='" + napravlenie + '\'' +
                ", t_pribitiya=" + t_pribitiya +
                ", t_otpravleniya=" + t_otpravleniya +
                ", rastoyanie=" + rastoyanie +
                '}';
    }
}
