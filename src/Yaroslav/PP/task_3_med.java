package Yaroslav.PP;

import java.util.Scanner;

public class task_3_med {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        String era;

        System.out.print("Введіть рік: ");
        year = input.nextInt();

        System.out.print("Введіть еру (AD або BC): ");
        era = input.next();

        System.out.println(getYearInfo(year, era));


    }

    static String getYearInfo(int year, String era){

        String result = year + " рік ";

        if (era.equals("BC"))
            result += " до ";

        result += " нашої ери - ";

        if (year % 4 == 0)
            result += "високосний";
        else
            result += "звичайний";

        return result;
    }



}
