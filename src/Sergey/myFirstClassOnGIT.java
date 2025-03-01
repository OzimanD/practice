package Sergey;

public class myFirstClassOnGIT {
    public static void main(String[] args) {
        res_oper(2,4);
    }
    static void res_oper(int i_a, int i_b){
        int i_tmp = 0;
        for (int i = i_a; i <= i_b; i++) {
            System.out.println(i);
            ++i_tmp;
        }
        System.out.println(i_tmp);
    }
}