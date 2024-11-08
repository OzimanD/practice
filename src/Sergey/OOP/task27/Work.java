package Sergey.OOP.task27;

public class Work {
    private String lastname;
    private int year;
    private String doljnost;
    private int zp;
    private String learn;

    public Work(String lastname, int year, String doljnost, int zp, String learn) {
        this.lastname = lastname;
        this.year = year;
        this.doljnost = doljnost;
        this.zp = zp;
        this.learn = learn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    @Override
    public String toString() {
        return "Work{" +
                "lastname='" + lastname + '\'' +
                ", year=" + year +
                ", doljnost='" + doljnost + '\'' +
                ", zp=" + zp +
                ", learn='" + learn + '\'' +
                '}';
    }
}
