package Mamontoboi.Task17;

import java.util.ArrayList;

public class Main implements MainInterface{
    public static void main(String[] args) {
        Item[] arrayOfItems = {new Item("Item 1", "Phillips", 1995, 4, 600),
                new Item("Item 2", "Phillips5", 2024, 4, 900),
                new Item("Item 3", "Phillips2", 2009, 3, 600),
                new Item("Item 4", "Phillips", 1995, 4, 700),
                new Item("Item 5", "Phillips1", 2024, 4, 10500)
        };

        MainInterface main = new Main();
        System.out.println("The sum of all goods " + main.sumOfProducts(arrayOfItems));
        System.out.println("The goods details " + main.printDetails(arrayOfItems));

    }



    @Override
    public int sumOfProducts(Item[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int year = array[i].getYear();
            int price = array[i].getPrice();
            if (year == 2024){
                result += price;
            }
        }
        return result;
    }

    @Override
    public ArrayList<Item> printDetails(Item[] array) {
        ArrayList<Item> arrayOfItems= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int year = array[i].getYear();
            if (year == 2024){
                arrayOfItems.add(array[i]);
            }
        }

        return arrayOfItems;
    }
}
