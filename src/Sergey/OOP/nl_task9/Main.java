package Sergey.OOP.nl_task9;

import java.util.ArrayList;

public class Main implements CarInter{
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Ford","Ford","pasaje",1990,1989),
                new Car("Porshe","Porshe","pasaje",1990,1978),
                new Car("Ford","Ford","pasaje",1990,1997),
                new Car("Ford","Ford","cruise",1990,2010),
                new Car("Gazel","Gazel","pasaje",1990,2000)
        };

        CarInter carI = new Main();
        System.out.println(carI.car_res(cars));
    }

    @Override
    public ArrayList<Car> car_res(Car[] cars) {
        ArrayList<Car> al_res = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMarka() == "Ford" && cars[i].getYearRegist()<2000){
             al_res.add(cars[i]);
            }
        }
        return al_res;
    }
}
