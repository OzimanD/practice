package ALina.OOP.lesson3_page113_task10;

public class Books {
    private String Author;
    private int pages;
    private int serie;
    private int year;

    public Books(String author, int pages, int serie, int year) {
        Author = author;
        this.pages = pages;
        this.serie = serie;
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
