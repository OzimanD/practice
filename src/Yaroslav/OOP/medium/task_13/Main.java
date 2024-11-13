package Yaroslav.OOP.medium.task_13;

import java.util.ArrayList;

public class Main implements MainMenu {

    public ArrayList<Car> findCar(Car[] cars, int yearOfRegistration, double carryingCapacity){

        ArrayList<Car> result = new ArrayList<>();

        for (Car car : cars){
            if ((car.getYearOfRegistration() < yearOfRegistration) && (car.getCarryingCapacity() > carryingCapacity)){
                result.add(car);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        MainMenu menu = new Main();

        Car[] cars = {
                new Car("БМВ X6", "Байріше мотурен верке", 770, 2010, 2011)
        };


        ArrayList<Car> carsList = menu.findCar(cars, 2023, 3);

        for(Car car : carsList){
            System.out.println(car);
        }

    }


}
