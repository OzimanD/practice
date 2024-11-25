package Sergey.Advance.task19;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main implements FootbolistInter{
    public static void main(String[] args) {
        Footbolist[] igroki = {
                new Footbolist("Vasya1", 1997,"Ukraina1","zachita",4,"Evpatoriya1"),
                new Footbolist("Vasya2", 1998,"Ukraina2","napadenie",40,"Evpatoriya2"),
                new Footbolist("Vasya3", 2005,"Ukraina3","zachita",80,"Evpatoriya3"),
                new Footbolist("Vasya4", 2000,"Ukraina4","vrotar",55,"Evpatoriya4"),
                new Footbolist("Vasya5", 2010,"Ukraina5","zachita",20,"Evpatoriya5")
        };

        FootbolistInter fi = new Main();
        System.out.println(fi.lf(igroki));
    }


    @Override
    public List<Footbolist> lf(Footbolist[] igroki) {
        List<Footbolist> lfres = new ArrayList<>();
        int yres = 0;
        for (int i = 0; i <igroki.length ; i++) {
            yres = 2024 - igroki[i].getBirthday();
            if(yres < 20 && igroki[i].getKolvoIgr() > 40){
                lfres.add(igroki[i]);
            }
        }
        return lfres;
    }
}
