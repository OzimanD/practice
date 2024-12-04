package Sergey.Advance.task25;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main implements FootbolInter {
    public static void main(String[] args) {
        Footbalist[] igroki = {
//                new Footbalist("Familiya1", 1994,"zashita",2,0,"Urk1"),
//                new Footbalist("Familiya2", 1998,"zashita",5,6,"Urk2"),
//                new Footbalist("Familiya3", 1999,"vrotar",4,1,"Urk3"),
//                new Footbalist("Familiya4", 2005,"napadayshiy",12,7,"Urk4"),
//                new Footbalist("Familiya5", 2006,"zashita",9,6,"Urk5")
                new Footbalist("Familiya1", LocalDate.of(1994, 2, 4), "zashita", 2, 1, "Urk1"),
                new Footbalist("Familiya2", LocalDate.of(1998, 2, 5), "zashita", 5, 6, "Urk2"),
                new Footbalist("Familiya3", LocalDate.of(1999, 7, 12), "vrotar", 4, 1, "Urk3"),
                new Footbalist("Familiya4", LocalDate.of(2005, 5, 30), "napadayshiy", 12, 7, "Urk4"),
                new Footbalist("Familiya5", LocalDate.of(2006, 1, 15), "zashita", 9, 6, "Urk5")
        };

        FootbolInter fi = new Main();

        System.out.println(fi.lfootb(igroki));
    }

    @Override
    public List<Footbalist> lfootb(Footbalist[] igroki) {
        List<Footbalist> lf = new ArrayList<>();
        int old;
        for (int i = 0; i < igroki.length; i++) {
            old = LocalDate.now().getYear() - igroki[i].getBd().getYear();
            if (old > 20 && (igroki[i].getKolvoIgr()/igroki[i].getKolvoGolov()) >= 0.4) {
                lf.add(igroki[i]);
            }
        }
        return lf;
    }

//    @Override
//    public List<Footbalist> lfootb(Footbalist[] igroki) {
//        List<Footbalist> lf = new ArrayList<>();
//        int old = 0;
//        for (int i = 0; i <  igroki.length; i++) {
//            old = 2024 - igroki[i].getBd();
//            if (old > 20 && igroki[i].getKolvoGolov() >= 4){
//                lf.add(igroki[i]);
//            }
//        }
//        return lf;
//    }

}
