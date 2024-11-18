package ALina.OOP.page121_4;

import java.util.ArrayList;

public class Main implements Interface {

    public static void main(String[] args) {
        Car a1 = new Car("Toyota","Toyota Motor Corporation","Sedan",2020,2020);
        Car a2 = new Car ("Toyota","Toyota Motor Corporation","Sedan",2000,2005);
        Car a3 = new Car ("Toyota","Toyota Motor Corporation","Sedan",2004,2005);
        Car a4 = new Car ("Toyota","Toyota Motor Corporation","Sedan",2001,2003);
        Car a5 = new Car ("Toyota","Toyota Motor Corporation","Sedan",2020,2023);

        Car[] a = {a1, a2, a3, a4, a5};

        Interface in = new Main();
        System.out.println(in.registeredBefore2007(a));

    }


    @Override
    public ArrayList<Car> registeredBefore2007(Car[] cars) {
        ArrayList<Car> result= new ArrayList<>();
        for (int i = 0; i < cars.length ; i++) {
            if (cars[i].getRegistrationDate()<2007) {
               result.add(cars[i]);

            }

        }

        return result;
    }
}
