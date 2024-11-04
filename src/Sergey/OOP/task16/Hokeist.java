package Sergey.OOP.task16;
//класс далее
public class Hokeist {
    //объявляем переменные далее
    private String lastname;
    private int age;
    private int kolvoGame;
    private int kolvoShayb;
    //создаем конструктор далее
    public Hokeist(String lastname, int age, int kolvoGame, int kolvoShayb) {
        this.lastname = lastname;
        this.age = age;
        this.kolvoGame = kolvoGame;
        this.kolvoShayb = kolvoShayb;
    }
    //создаем геттеры и сеттеры далее
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKolvoGame() {
        return kolvoGame;
    }

    public void setKolvoGame(int kolvoGame) {
        this.kolvoGame = kolvoGame;
    }

    public int getKolvoShayb() {
        return kolvoShayb;
    }

    public void setKolvoShayb(int kolvoShayb) {
        this.kolvoShayb = kolvoShayb;
    }
    //возвращаем даныные, а не ссылку на объект далее
    @Override
    public String toString() {
        return "Hokeist{" +
                "lastname='" + lastname + '\'' +
                ", age=" + age +
                ", kolvoGame=" + kolvoGame +
                ", kolvoShayb=" + kolvoShayb +
                '}';
    }
}
