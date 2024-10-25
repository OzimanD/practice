package Sergey.OOP.task4;
//клас далее
public class Main {
    //метод  для запуска кода далее
    public static void main(String[] args) {
        //в МАИН создаем и инициализируем объекты далее
        Item item = new Item("photo",4, 12.49,"Nicon",2023);
        Item item2 = new Item("photo2",5, 1.49,"Nicon2",2022);
        Item item3 = new Item("photo3",1, 134.49,"Nicon3",2021);
        Item item4 = new Item("photo4",8, 12.34,"Nicon4",2019);
        Item item5 = new Item("photo5",3, 15.45,"Nicon5",2020);
//создаем массив объектов далее
        Item[] items = {item,item2,item3, item4, item5};
//вызываем метод и передаем параметры массив объекта и искомое число (параметр для сравнения) далее
        itemResul(items, 5);
    }
    //создаем метод, который находит и вывод кол-во товаров больше 5 далее
    public static void itemResul(Item[] items, int count){
        //цыкл ФОР далее
        for (int i = 0; i < items.length; i++) {
            //ИФ далее
            if(items[i].getKolvo() > count){
                //вывод данных далее
                System.out.println(items[i]);
            }
        }
    }
}
