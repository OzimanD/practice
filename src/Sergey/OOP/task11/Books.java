package Sergey.OOP.task11;

///Автор
//Жанр
//Название
//Тираж


public class Books {
    private String autor;
    private String janr;
    private String name;
    private int tiraj;

    public Books(String autor, String janr, String name, int tiraj) {
        this.autor = autor;
        this.janr = janr;
        this.name = name;
        this.tiraj = tiraj;
    }

    public Books(){};

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiraj() {
        return tiraj;
    }

    public void setTiraj(int tiraj) {
        this.tiraj = tiraj;
    }

    @Override
    public String toString() {
        return "Books{" +
                "autor='" + autor + '\'' +
                ", janr='" + janr + '\'' +
                ", name='" + name + '\'' +
                ", tiraj='" + tiraj + '\'' +
                '}';
    }
}


