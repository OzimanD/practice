package Sergey.OOP.task9;
//клас далее
public class Main {
    //метод  для запуска кода далее
    public static void main(String[] args) {
//в МАИН создаем и инициализируем объекты далее
        Item item1 = new Item("MP3", 2, 15.35, "Sony", 2019);
        Item item2 = new Item("MP4", 5, 11.1, "Walkman", 2020);
        Item item3 = new Item("iPod", 1, 30.99, "Apple", 2024);
        Item item4 = new Item("CD", 7, 26.34, "Sony", 2021);
        Item item5 = new Item("MP3", 12, 13.35, "Pix", 2019);
//создаем массив объектов далее
        Item items[] = {item1, item2, item3, item4, item5};
//вызываем метод и передаем параметры массив объекта и искомое число (параметр для сравнения) далее
        avgHightPrice(items);
    }
//создаем метод, который выводит товары с ценой выше стредней далее
    public static void avgHightPrice(Item items[]){
        //создаем переменную, куда вносим значения и вычисляем среднюю цену далее
        double avgPrice = (items[0].getPrice() + items[1].getPrice()
                + items[2].getPrice() + items[3].getPrice() + items[4].getPrice())/5;
        //цыкл ФОР далее
        for (int i = 0; i < items.length; i++) {
            //ИФ далее
            if(items[i].getPrice() > avgPrice){
                //вывод данных далее
                System.out.println(items[i]);
            }
        }
    }
}


