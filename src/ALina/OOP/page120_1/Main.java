package ALina.OOP.page120_1;

import java.util.ArrayList;

public class Main implements Interface{
    public static void main(String[] args) {
        Engeneers e1 = new Engeneers(1990, "UA", "f","A", "A", "A");
        Engeneers e2 = new Engeneers(1950, "UA", "m","A", "A", "A");
        Engeneers e3 = new Engeneers(1955, "UA", "f","A", "A","A");
        Engeneers e4 = new Engeneers(1948, "UA", "f","A", "A","A");
        Engeneers e5 = new Engeneers(1960, "UA", "m","A", "A","A");

        Engeneers[] e = {e1,e2,e3,e4,e5};


        Interface in = new Main();   // виклик методів котрі не є статичними

        System.out.println(in.ageOver60F(e));
        System.out.println(in.ageOver60M(e));

    }




    @Override
    public ArrayList<Engeneers> ageOver60F(Engeneers[] engeneers) {
        ArrayList<Engeneers> result = new ArrayList<>();
        for (int i = 0; i < engeneers.length; i++) {
            if (engeneers[i].getSex().equals("f") && engeneers[i].getDateOfBirth()<1964){
               result.add(engeneers[i]);
            }

        }

        return result;
    }

    @Override
    public ArrayList<Engeneers> ageOver60M(Engeneers[] engeneers) {
        ArrayList<Engeneers> result1 = new ArrayList<>();
        for (int i = 0; i < engeneers.length; i++) {
            if (engeneers[i].getSex().equals("m") && engeneers[i].getDateOfBirth()<1959){
                result1.add(engeneers[i]);
            }

        }

        return result1;
    }
}
