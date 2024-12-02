package Sergey.Advance.task22;

import java.time.LocalDate;

public class Cars {
    private String marka;
    private String corp;
    private String type;
    private LocalDate year_start;
    private LocalDate year_regist;

    public Cars(String marka, String corp, String type, LocalDate year_start, LocalDate year_regist) {
        this.marka = marka;
        this.corp = corp;
        this.type = type;
        this.year_start = year_start;
        this.year_regist = year_regist;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getYear_start() {
        return year_start;
    }

    public void setYear_start(LocalDate year_start) {
        this.year_start = year_start;
    }

    public LocalDate getYear_regist() {
        return year_regist;
    }

    public void setYear_regist(LocalDate year_regist) {
        this.year_regist = year_regist;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "marka='" + marka + '\'' +
                ", corp='" + corp + '\'' +
                ", type='" + type + '\'' +
                ", year_start=" + year_start +
                ", year_regist=" + year_regist +
                '}';
    }
}
