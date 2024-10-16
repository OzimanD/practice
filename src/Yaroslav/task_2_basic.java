package Yaroslav;

import java.util.Scanner;

public class task_2_basic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int experience;
        double salary, premium;

        System.out.print("Введіть стаж: ");
        experience = input.nextInt();

        System.out.print("Введіть зарплату: ");
        salary = input.nextDouble();

        premium = getPremium(experience, salary);

        System.out.println("Надбавка складає: " + premium);
        System.out.println("Сума до виплати: " + (salary + premium));


    }

    static double getPremium(int exp, double salary){

        if (exp >= 2 && exp < 5)
            return salary * 0.02;

        else if (exp >= 5 && exp < 10)
            return salary * 0.05;

        return 1;   // Оскільки метод повинен повертати щось в будь-якому разі,
                    // треба виставити значення за замовчуванням
    }


}
