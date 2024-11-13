package Mamontoboi.Task7;

public class Student {
    private String surname;
    private String group;
    private int physics;
    private int informatics;
    private int history;

    public Student(String surname, String group, int physics, int informatics, int history) {
        this.surname = surname;
        this.group = group;
        this.physics = physics;
        this.informatics = informatics;
        this.history = history;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", physics=" + physics +
                ", informatics=" + informatics +
                ", history=" + history +
                '}';
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

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getInformatics() {
        return informatics;
    }

    public void setInformatics(int informatics) {
        this.informatics = informatics;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}
