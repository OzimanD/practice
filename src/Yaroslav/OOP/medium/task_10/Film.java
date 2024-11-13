package Yaroslav.OOP.medium.task_10;

public class Film {

    private String name;
    private double date;
    private int duration;
    private String genre;
    private int budget;

    public Film(String name, double date, int duration, String genre, int budget) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

