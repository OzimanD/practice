package Sergey.Advance;

public class Air {
    private int id;
    private int t_vileta;
    private int t_trileta;
    private String marka;
    private String napravlenie;
    private int rastoyanie;
    private int avgSpeed;

    public Air(int id, int t_vileta, int t_trileta, String marka, String napravlenie, int rastoyanie) {
        this.id = id;
        this.t_vileta = t_vileta;
        this.t_trileta = t_trileta;
        this.marka = marka;
        this.napravlenie = napravlenie;
        this.rastoyanie = rastoyanie;
        this.avgSpeed = (t_trileta - t_vileta / rastoyanie);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getT_vileta() {
        return t_vileta;
    }

    public void setT_vileta(int t_vileta) {
        this.t_vileta = t_vileta;
    }

    public int getT_trileta() {
        return t_trileta;
    }

    public void setT_trileta(int t_trileta) {
        this.t_trileta = t_trileta;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNapravlenie() {
        return napravlenie;
    }

    public void setNapravlenie(String napravlenie) {
        this.napravlenie = napravlenie;
    }

    public int getRastoyanie() {
        return rastoyanie;
    }

    public void setRastoyanie(int rastoyanie) {
        this.rastoyanie = rastoyanie;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    @Override
    public String toString() {
        return "Air{" +
                "id=" + id +
                ", t_vileta=" + t_vileta +
                ", t_trileta=" + t_trileta +
                ", marka='" + marka + '\'' +
                ", napravlenie='" + napravlenie + '\'' +
                ", rastoyanie=" + rastoyanie +
                ", avgSpeed=" + avgSpeed +
                '}';
    }
}

