package ALina.OOP.page120_task29;

import java.util.ArrayList;

public class Main implements MyInterface {
    public static void main(String[] args) {
        Goods goods1 = new Goods(34, 24.5, 2004, "a");
        Goods goods2 = new Goods(45, 25, 2024, "b");
        Goods goods3 = new Goods(50, 34.5, 2014, "c");
        Goods goods4 = new Goods(10, 28.5, 2000, "d");
        Goods goods5 = new Goods(4, 24, 2016, "e");

        Goods[] arrayGoods = {goods1,goods2,goods3,goods4,goods5};
        MyInterface myInterface = new Main();

        System.out.println(myInterface.moreThanTwoYears(arrayGoods));

        ArrayList<Goods> a = new ArrayList<>();

        a = myInterface.moreThanTwoYears(arrayGoods);

       System.out.println(a.get(1));

       Goods goods7 = a.get(0);
       goods7.setPrice(100);
        System.out.println(goods7);


    }


    @Override
    public ArrayList<Goods> moreThanTwoYears(Goods[] arrayGoods) {
        ArrayList<Goods> obj = new ArrayList<>();

        for (int i = 0; i < arrayGoods.length; i++) {
            if(arrayGoods[i].getYear()<2022){
             obj.add(arrayGoods[i]);
            }
        }
        return  obj;
    }
}
