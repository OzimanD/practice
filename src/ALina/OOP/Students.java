package ALina.OOP;



//Фамилия
// Группа
//Физика
// Информ
//История

//Определить средний бал оценок по
// всем предметам, и вывести сведе-
//ния о студентах, средний балл
//которых больше 4.


public class Students {
    private String surname;
    private String group;
    private int phisics;
    private int info;
    private int history;

    public Students(String surname, String group, int phisics, int info, int history) {
        this.surname = surname;
        this.group = group;
        this.phisics = phisics;
        this.info = info;
        this.history = history;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPhisics() {
        return phisics;
    }

    public void setPhisics(int phisics) {
        this.phisics = phisics;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}
