package Mamontoboi.Task18;

public class Main implements MainInterface{

    public static void main(String[] args) {
        Item[] arrayOfItems = {new Item("Item 1", "Phillips", 1995, 4, 600),
                new Item("Item 2", "Phillips5", 2024, 4, 900),
                new Item("Item 3", "Phillips2", 2009, 3, 600),
                new Item("Item 4", "Phillips", 1995, 4, 700),
                new Item("Item 5", "Phillips1", 2024, 4, 10500)
        };

        MainInterface mainArrayOfItems = new Main();

        System.out.println("Average price " + mainArrayOfItems.avgPrice(arrayOfItems));
        System.out.println("Min price item " + mainArrayOfItems.minPriceItem(arrayOfItems));
    }

    @Override
    public double avgPrice(Item[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }
        return (double) sum / array.length;
    }


    @Override
    public Item minPriceItem(Item[] array) {
        Item minPriceItem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPrice() < minPriceItem.getPrice()){
                minPriceItem = array[i];
            }
        }
        return minPriceItem;
    }
}
