package Sergey.OOP.task25;

import java.util.ArrayList;

public class Main implements ItemInter {
    public static void main(String[] args) {
        Item[] items = {
                new Item(3, 34.45, 2020, "HP"),
                new Item(6, 234.45, 2012, "Sony"),
                new Item(2, 332.45, 2023, "Wallkman"),
                new Item(14, 124.45, 2022, "Acer"),
                new Item(56, 12.45, 2010, "Samsung")
        };

        ItemInter itemIn = new Main();

        System.out.println(itemIn.al_bigPrice(items));
        System.out.println(itemIn.al_result(items));
    }


    @Override
    public ArrayList<Double> al_bigPrice(Item[] items) {
        ArrayList<Double> al_bp = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if(items[i].getPrice() > 300.00){
                al_bp.add(items[i].getPrice());
            }
        }
        return al_bp;
    }


    @Override
    public ArrayList<String> al_result(Item[] items) {
        ArrayList al_res = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if(items[i].getPrice() > 300.00){
                al_res.add(items[i]);
            }
        }
        return al_res;
    }


//    @Override
//    public ArrayList<String> al_result(Item[] items) {
//        ArrayList<String> al_res = new ArrayList<>();
//        for (int i = 0; i < items.length; i++) {
//            al_res.add(items[i]);
//        }
//        return al_res;
//    }
//
//    @Override
//    public ArrayList<Double> al_bigPrice(Item[] items) {
//        double[] ad_bp = new double[10];
//        for (int i = 0; i < items.length; i++) {
//            ad_bp[i] = items[i].getPrice();
//
//        }
//        Arrays.sort(ad_bp);
//        double d_bp = ad_bp[items.length];
//        return d_bp;
//    }


//    @Override
//    public Item[] al_bigPrice(Item[] items) {
//        Item[] al_bigPrice = new Item[0];
//        double d_pr = 300.00;
//        for (int i = 0; i > items.length; i++) {
//                al_bigPrice = new Item[]{items[i]};
//        }
//        return al_bigPrice;
//    }
}

