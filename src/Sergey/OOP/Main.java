package Sergey.OOP;

public class Main {
    public static void main(String[] args) {
       Item item1 = new Item("Vasyl", "photo", 1, 249.99,2023);
       Item item2 = new Item("Petro", "phone", 12, 1499.99,2021);
       Item item3 = new Item("Slava", "MP3", 5, 49.99,2018);
       Item item4 = new Item("Vitek", "TV", 7, 649.99,2024);

       Item[] allSold = {item1,item2,item3,item4};
       colvoSold(allSold);
    }

    static void colvoSold (Item[] allSold){
        int i_a = 2024;
        for (int i = 0; i < allSold.length; i++) {
            i_a = 2024 - 4;
            if(allSold[i].getYear() > i_a){
                System.out.println(allSold[i]);
            }
        }
    }
}
