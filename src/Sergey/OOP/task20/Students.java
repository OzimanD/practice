package Sergey.OOP.task20;
//оздается класс далее
public class Students {
    private String lastname;
    private String group;
    private int year;
    private int fizica;
    private int matesha;
    private int inform;
    //создается конструктор далее
    public Students(String lastname, String group, int year, int fizica, int matesha, int inform) {
        this.lastname = lastname;
        this.group = group;
        this.year = year;
        this.fizica = fizica;
        this.matesha = matesha;
        this.inform = inform;
    }
    //создаются геттеры и сеттеры далее
    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    public int getYear() {
        return year;
    }

    public int getFizica() {
        return fizica;
    }

    public int getMatesha() {
        return matesha;
    }

    public int getInform() {
        return inform;
    }
    //создается возврат данных, а не ссылка далее
    @Override
    public String toString() {
        return "Students{" +
                "lastname='" + lastname + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", fizica=" + fizica +
                ", matesha=" + matesha +
                ", inform=" + inform +
                '}';
    }
}
