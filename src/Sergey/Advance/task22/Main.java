package Sergey.Advance.task22;

import java.util.ArrayList;
import java.util.List;

public class Main implements CarsInter{
    public static void main(String[] args) {
        Cars[] cars = {
                new Cars("Toyota1","Toyota1","legkaya",2010,2012),
                new Cars("Toyota2","Toyota2","tyazholaya",2020,2024),
                new Cars("Toyota3","Toyota3","tyazholaya",1994,2024),
                new Cars("Toyota4","Toyota4","legkaya",1999,2000),
                new Cars("Toyota5","Toyota5","legkaya",2005,2005)
        };

        CarsInter ci = new Main();

        System.out.println(ci.lcars(cars));
    }


    @Override
    public List<Cars> lcars(Cars[] cars) {
        List<Cars> lcars = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getYear_start()<2005 && cars[i].getYear_regist() == 2024){
                lcars.add(cars[i]);
            }
        }
        return lcars;
    }
}
