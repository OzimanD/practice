package Sergey.OOP.nl_task9;

public class Car {
    private String marka;
    private String corp;
    private String type;
    private int year;
    private int yearRegist;

    public Car(String marka, String corp, String type, int year, int yearRegist) {
        this.marka = marka;
        this.corp = corp;
        this.type = type;
        this.year = year;
        this.yearRegist = yearRegist;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearRegist() {
        return yearRegist;
    }

    public void setYearRegist(int yearRegist) {
        this.yearRegist = yearRegist;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", corp='" + corp + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", yearRegist=" + yearRegist +
                '}';
    }
}
