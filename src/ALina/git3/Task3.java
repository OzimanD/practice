package ALina.git3;

//For1. Даны целые числа K и N (N > 0). Вывести N раз число K.

public class Task3 {

    public static void main(String[] args) {
        int K = -2;
        int N = 4;
        res(-2, 4);
    }

    static void res ( int k, int n){

        if (n>0) {
            for (int i = 0; i < n; i++) {
                System.out.println(k);

            }
        }


    }
}
