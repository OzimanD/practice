package Sergey.Advance.task30;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main implements CarInter{
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Gazel1","VAZ","gryzovaya", LocalDate.of(2021,5,1),
                        LocalDate.of(2023,12,14), LocalDate.of(2020,1,1)),
                new Car("Gazel2","VAZ","gryzovaya", LocalDate.of(2022,5,1),
                        LocalDate.of(2024,12,14), LocalDate.of(2022,1,1)),
                new Car("Gazel3","VAZ","gryzovaya", LocalDate.of(2023,5,1),
                        LocalDate.of(2022,12,14), LocalDate.of(2023,1,1)),
                new Car("Gazel4","VAZ","gryzovaya", LocalDate.of(2023,5,1),
                        LocalDate.of(2024,12,1), LocalDate.of(2023,1,1)),
                new Car("Gazel5","VAZ","gryzovaya", LocalDate.of(2022,5,1),
                        LocalDate.of(2023,12,15), LocalDate.of(2022,1,1))
        };

        CarInter ci = new Main();

        System.out.println(ci.lcars(cars));
    }


    @Override
    public List<Car> lcars(Car[] cars) {
        List<Car> lc = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            int period = (Period.between(LocalDate.now(), cars[i].getTechOsmotr())).getYears();
            if (period < 0){
                lc.add(cars[i]);
            }
        }
        return lc;
    }
}
