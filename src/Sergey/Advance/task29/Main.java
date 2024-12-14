package Sergey.Advance.task29;

import java.time.LocalDate;
import java.time.Period;

public class Main implements ItemsInter{
    public static void main(String[] args) {
        Items[] items = {
                new Items("Tovar1",20.50, LocalDate.of(2021,1,4), LocalDate.of(2025,5,6),5,"Sony1"),
                new Items("Tovar2",26.50, LocalDate.of(2020,1,4), LocalDate.of(2020,4,5),5,"Sony2"),
                new Items("Tovar3",70.70, LocalDate.of(2022,1,4), LocalDate.of(2022,6,12),5,"Sony3"),
                new Items("Tovar4",6540.99, LocalDate.of(2010,1,4), LocalDate.of(2025,8,12),15,"Sony4"),
                new Items("Tovar5",230.80, LocalDate.of(2022,1,4), LocalDate.of(2022,3,30),5,"Sony5")
        };

        ItemsInter ii = new Main();

        System.out.println(ii.resPrice(items));
    }

    @Override
    public double resPrice(Items[] items) {
        double resPr = 0.0;
        for (int i = 0; i < items.length; i++) {
            int ldRes = (Period.between(LocalDate.now(), items[i].getLd_godnost())).getDays();
            if(ldRes > 0){
                resPr += items[i].getPrice() * items[i].getKolvo();
            }
        }
        return resPr;
    }
}
