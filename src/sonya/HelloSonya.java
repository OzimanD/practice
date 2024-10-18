package sonya;

public class HelloSonya {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 7;

        System.out.println(isBetween(a, b, c));
    }

    static boolean check(int n, int k) {
        boolean result;
        result = (n > 2) && (k <= 3);
        return result;
    }

    static boolean isBetween(int a, int b, int c) {
        boolean result;
        result = (a < b) && (b < c);
        return result;
    }
}
