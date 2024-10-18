package ALina.git3;


//Дано целое число. Если оно является положительным, то прибавить к
//нему 1; в противном случае не изменять его. Вывести полученное число.


import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть число:");
        int input = scanner.nextInt();
        int result = ifPositive(input);
        System.out.println(result);


//        System.out.println(""+ ifPositive(input));

    }

    static int ifPositive (int a) {
        if (a >= 0) {
            return a + 1;
        }

        return a;
    }

}
