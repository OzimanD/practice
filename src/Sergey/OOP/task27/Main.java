package Sergey.OOP.task27;

import java.util.ArrayList;

public class Main implements WorkInter{
    public static void main(String[] args) {
        Work[] works = {new Work("Familiya1",1968,"ingener",800,"DPI"),
                new Work("Familiya2",1968,"elektrik",1900,"KPI"),
                new Work("Familiya3",1990,"master",860,"DNI"),
                new Work("Familiya4",1979,"starshiy ingener",1200,"KNY"),
                new Work("Familiya5",1997,"ingener",1400,"ODE")
        };

        WorkInter wi = new Main();

        System.out.println(wi.al_workers(works));
        System.out.println(wi.al_res(works));
    }


    @Override
    public int al_workers(Work[] works) {
        int kolvo = 0;
        for (int i = 0; i < works.length; i++) {
            if (works[i].getDoljnost() == "ingener") {
                ++kolvo;
            }
        }
        return kolvo;
    }

    @Override
    public ArrayList<Work> al_res(Work[] works) {
        ArrayList<Work> al_res = new ArrayList<>();
        for (int i = 0; i < works.length; i++) {
            if (works[i].getDoljnost() == "ingener") {
                al_res.add(works[i]);
            }
        }
        return al_res;
    }
}
