package Sergey;

public class myFirstClassOnGIT {
        public static void main(String[] args) {
            int[] i_res = i_oper(23, 7, 12);
            System.out.println(i_res[0]);
            System.out.println(i_res[1]);
        }

        static int[] i_oper(int i_a, int i_b, int i_c) {
            int[] iarr_tmp = {0,0};
            if (i_a > 0) {
                iarr_tmp[1] += 1;
            } else {
                iarr_tmp[0] += 1;
            }
            if (i_b > 0){
                iarr_tmp[1] += 1;
            } else {
                iarr_tmp[0] += 1;
            }
            if (i_c > 0){
                iarr_tmp[1] += 1;
            } else {
                iarr_tmp[0] += 1;
            }
            return iarr_tmp;

        }
    }