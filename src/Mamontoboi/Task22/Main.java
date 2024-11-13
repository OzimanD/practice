package Mamontoboi.Task22;

import java.util.ArrayList;

public class Main implements MainInterface{
    public static void main(String[] args) {
        Laptop[] laptops = {new Laptop("Lenovo Legion", 60, 32, false, 40000),
                new Laptop("Lenovo Think Pad", 60, 16, true, 32000),
                new Laptop("MacBook Air", 60, 8, true, 60000),
                new Laptop("MacBook Pro", 60, 16, true, 120000),
                new Laptop("HP", 60, 4, true, 20000)};

        Main main = new Main();

        System.out.println("Number of laptops with RAM > 10 Gb is " + main.countLaptops(laptops));
    }

    @Override
    public int countLaptops(Laptop[] laptops){
        int counter = 0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getRAM() > 10){
                counter += 1;
            }
        }
        return counter;
    }
}
