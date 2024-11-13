package Sergey.OOP.nl_task12;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Main implements FootbolistInter{
    public static void main(String[] args) {
        Footbolist[] fbs = {
                new Footbolist("Familia1", 1997,"Kiev","vratar",2,0),
                new Footbolist("Familia2", 1999,"Kiev","napadayshiy",5,1),
                new Footbolist("Familia3", 1999,"Kiev","zashitnik",7,1),
                new Footbolist("Familia4", 1997,"Kiev","zashitnik",12,4),
                new Footbolist("Familia5", 1997,"Kiev","napadayshiy",6,4)
        };

        FootbolistInter iff = new Main();
        System.out.println(iff.al_fb(fbs));
    }


    @Override
    public ArrayList<Footbolist> al_fb(Footbolist[] fbs) {
        ArrayList<Footbolist> al_fb = new ArrayList<>();
        int years;
        for (int i = 0; i < fbs.length; i++) {
            years = 2024 - fbs[i].getBd();
            if(years > 20 && fbs[i].getKolov_kard()<1){
                al_fb.add(fbs[i]);
            }
        }
        return al_fb;
    }
}
