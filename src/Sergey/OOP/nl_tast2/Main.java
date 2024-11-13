package Sergey.OOP.nl_tast2;

import java.util.ArrayList;

public class Main implements TrainInter{
    public static void main(String[] args) {
        Train[] trains = {
                new Train(653, "Evpatoriya1", 14, "Kiev1", 4),
                new Train(653, "Evpatoriya2", 12, "Kiev2", 6),
                new Train(653, "Evpatoriya3", 16, "Kiev3", 12),
                new Train(653, "Evpatoriya4", 15, "Kiev4", 14),
                new Train(653, "Evpatoriya5", 21, "Kiev5", 1)
        };

        TrainInter tr = new Main();

        System.out.println(tr.al_res(trains));

    }


    @Override
    public ArrayList<Train> al_res(Train[] trains) {
        ArrayList al_resTr = new ArrayList<>();
        int res_t;
        for (int i = 0; i < trains.length; i++) {
            res_t = trains[i].getH_pribitiya() - trains[i].getH_otbytiya();
                if(res_t>7) {
                    al_resTr.add(trains[i]);
                }
        }
        return al_resTr;
    }
}
