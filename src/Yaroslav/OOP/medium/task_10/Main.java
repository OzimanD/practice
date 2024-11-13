package Yaroslav.OOP.medium.task_10;

import java.util.ArrayList;

public class Main implements MainInterface{

    @Override
    public ArrayList<Film> findFilm(Film[] films, double date, int duration){

        ArrayList<Film> result = new ArrayList<>();

        for(Film film : films){

            if ((film.getDate() > date) && (film.getDuration() > duration))
                result.add(film);

        }

        return result;
    }


    public static void main(String[] args) {

        MainInterface menu = new Main();

        Film[] films = {
                new Film("Зоряні війни 1", 19.50, 120, "Фантастика", 20000000),
                new Film("Зоряні війни 2", 11.50, 80, "Фантастика", 2000000),
                new Film("Зоряні війни 3", 21.50, 150, "Фантастика", 20000000),
                new Film("Зоряні війни 4", 13.10, 130, "Фантастика", 20000000),
                new Film("Зоряні війни 5", 17.50, 90, "Фантастика", 2000000),
                new Film("Зоряні війни 6", 14.50, 95, "Фантастика", 20000000)
        };

        ArrayList<Film> wantedFilms = menu.findFilm(films, 18, 100);

        for(Film film : wantedFilms){
            System.out.println(film);
        }

    }

}
