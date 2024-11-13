package Mamontoboi.Task13;

public class Player {
    private String lastname;
    private int age;
    private int gamesPlayed;
    private int goalsLost;

    public Player(String lastname, int age, int gamesPlayed, int goalsLost) {
        this.lastname = lastname;
        this.age = age;
        this.gamesPlayed = gamesPlayed;
        this.goalsLost = goalsLost;
    }

    public Player(String lastname, int age) {
        this.lastname = lastname;
        this.age = age;
        this.gamesPlayed = 0;
        this.goalsLost = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gamesPlayed=" + gamesPlayed +
                ", goalsLost=" + goalsLost +
                '}';
    }

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

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsLost() {
        return goalsLost;
    }

    public void setGoalsLost(int goalsLost) {
        this.goalsLost = goalsLost;
    }

}
