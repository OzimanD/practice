package Sergey.OOP.nl_task15;

import java.util.ArrayList;

public class Main implements TrainInter{
    public static void main(String[] args) {
        Train[] trains = {
                new Train(123,"Kiev1",14,2,340),
                new Train(321,"Kiev2",12,15,123),
                new Train(231,"Kiev3",16,12,2354),
                new Train(213,"Kiev4",23,1, 1263),
                new Train(141,"Kiev5",6,4,896)
        };

        TrainInter ti = new Main();
        System.out.println(ti.al_res(trains));
    }

    @Override
    public ArrayList<Train> al_res(Train[] trains) {
        ArrayList<Train> al_tr = new ArrayList<>();
        int t_pyti = 0;
        for (int i = 0; i < trains.length; i++) {
            t_pyti = trains[i].getT_pribitiya() - trains[i].getT_otpravleniya();
            if (t_pyti<0){
                al_tr.add(trains[i]);
            }
        }
        return al_tr;
    }
}
