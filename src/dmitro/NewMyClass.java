package dmitro;

import java.util.Scanner;

public class NewMyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plis input your pin");
        int myPin = sc.nextInt();
        System.out.println(tr(myPin));
    }

    static boolean tr(int a){
        boolean result;
        int myPin = 7777;
        result = (a==myPin);
        return result;
    }
}
