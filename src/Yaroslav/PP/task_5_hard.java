package Yaroslav.PP;

import java.util.ArrayList;

public class task_5_hard {

    public static void main(String[] args) {

        ArrayList<Integer> list = findPalindromeList(100);

        printPalindromeList(list);

    }

    static ArrayList<Integer> findPalindromeList(int limit){

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= 100; i++){

            if ( isPalindrome(i*i) )
                resultList.add(i);

        }

        return resultList;
    }

    // метод, який визначає, чи число є паліндромом
    static boolean isPalindrome(int num){

        // наше число
        String numStr = Integer.toString(num);

        // наше число задом-наперед
        String strNum = new StringBuilder(numStr).reverse().toString();

        // якщо число = числу задом-наперед, то вертаємо тру
        if (numStr.equals(strNum))
            return true;
        else
            return false;

    }

    // метод який виводить наш список
    static void printPalindromeList(ArrayList<Integer> list){

        for(Integer num : list){
            System.out.println(num + " : " + (num*num));
        }

    }

}
