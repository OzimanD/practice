package Sergey.Advance.task22;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main implements CarsInter{
    public static void main(String[] args) {
        Cars[] cars = {
                new Cars("Toyota1","Toyota1","legkaya", LocalDate.of(2010,01,05),LocalDate.of(2013,04,05)),
                new Cars("Toyota2","Toyota2","tyazholaya",LocalDate.of(2000,07,12),LocalDate.of(2024,12,04)),
                new Cars("Toyota3","Toyota3","tyazholaya",LocalDate.of(1998,5,23), LocalDate.of(2024,5,7)),
                new Cars("Toyota4","Toyota4","legkaya",LocalDate.of(2003,5,23), LocalDate.of(2003,6,7)),
                new Cars("Toyota5","Toyota5","legkaya",LocalDate.of(2005,5,23), LocalDate.of(2005,8,7))
        };

        CarsInter ci = new Main();

        System.out.println(ci.lcars(cars));
    }


    @Override
    public List<Cars> lcars(Cars[] cars) {
        List<Cars> lcars = new ArrayList<>();
//        Period ldStart;
        for (int i = 0; i < cars.length; i++) {
//            ldStart = Period.ofYears(Period.between(cars[i].getYear_start(), cars[i].getYear_regist()).getYears());
            int st = cars[i].getYear_start().getYear();
            int reg = cars[i].getYear_regist().getYear();
            int res = st - reg;
            if(st == reg) {
                if (cars[i].getYear_start().getYear() < 2005) {
                lcars.add(cars[i]);
                }
            }
        }
        return lcars;
    }
}
