package Sergey.Advance.task28;

import java.time.*;
import java.time.Period;
import java.util.ArrayList;


public class Main implements MansInter{
    public static void main(String[] args) {
        Mans[] mans = {
                new Mans("Familiya1", "Imya1","Otchestvo1","rabotnit","myjik", LocalDate.of(1960,5,3)),
                new Mans("Familiya2", "Imya2","Otchestvo2","rabotnit","jenschina", LocalDate.of(1970,8,12)),
                new Mans("Familiya3", "Imya3","Otchestvo3","zam","myjik", LocalDate.of(1954,3,4)),
                new Mans("Familiya4", "Imya4","Otchestvo4","rabotnit","myjik", LocalDate.of(1970,5,2)),
                new Mans("Familiya5", "Imya5","Otchestvo5","nachalnik","jenschina", LocalDate.of(1949,8,7))
        };

        MansInter mi = new Main();

        System.out.println("M: - " + mi.kolvo(mans)[0]);
        System.out.println("W: - " + mi.kolvo(mans)[1]);
    }


    @Override
    public int[] kolvo(Mans[] mans) {
        int countM = 0;
        int countW = 0;
        for (int i = 0; i < mans.length; i++) {
            int countY = Period.between(mans[i].getLdPriem(), LocalDate.now()).getYears();
            if(countY >= 65 && mans[i].getPol().equals("myjik")){
                ++countM;
            } else if(countY >= 60 && mans[i].getPol().equals("jenschina")){
                ++countW;
            }

        }
        int[] res = new int[2];
        res[0] = countM;
        res[1] = countW;
        return res;
    }
}
