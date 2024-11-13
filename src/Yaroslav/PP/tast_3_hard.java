package Yaroslav.PP;

import java.util.Scanner;

public class tast_3_hard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть натуральне число n: ");

        int n = input.nextInt();

        findMatches(n);

    }

    static void findMatches(int n){

        System.out.println("Перелік чисел, які задовільняють умову:");

        for(int i=1; i <= n; i++){
            if ( i == (i*i) % getNumDivisor(i) ){
                System.out.print(i + " : " + i*i + "\n");
            }
        }

    }

    static int getNumDivisor(int n){

        for( int divisor = 10; ; divisor*=10){
            if (n / divisor == 0){
                return divisor;
            }
        }

    }

}
