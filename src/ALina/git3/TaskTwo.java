package ALina.git3;

import java.util.Scanner;

//Даны три целых числа. Найти количество положительных чисел в исход-
//ном наборе.

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть число:");
        int input1 = scanner.nextInt();
        System.out.println("Введіть число:");
        int input2 = scanner.nextInt();
        System.out.println("Введіть число:");
        int input3 = scanner.nextInt();

        int result = ifPositive(input1, input2, input3);

        System.out.println(result);

    }

    static int ifPositive (int a, int b, int c) {
        int result = 0;

        if (a > 0) {
            result++;
        }

        if (b > 0) {
            result++;
        }

        if (c > 0) {
            result++;
        }
        return result;
    }

}
