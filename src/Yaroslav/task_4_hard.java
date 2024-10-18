package Yaroslav;

import java.util.ArrayList;
import java.util.Scanner;

public class task_4_hard {

    public static void main(String[] args) {

        ArrayList<Integer> list = findPalindrome(100);

        System.out.println("Список всіх паліндромів від 1 до 100");
        System.out.println(list);

    }

    static ArrayList<Integer> findPalindrome(int limit){

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            resultList.add(i);
        }

        for (int i = 10; i <= limit; i++){

            // наприклад    27 / 10 = 2
            //              27 % 10 = 7
            if( i/10 == i%10)
                resultList.add(i);
        }
        return resultList;
    }




}
