package Sergey.OOP.ln_task6;

import java.util.ArrayList;

public class Main implements TrainInter {
    public static void main(String[] args) {
        Train[] trains = {
                new Train(234,5,14,"Herson1",45),
                new Train(234,6,13,"Herson2",23),
                new Train(234,12,16,"Herson3",512),
                new Train(234,11,18,"Herson4",65),
                new Train(234,1,22,"Herson5",6534)
        };

        TrainInter trIn = new Main();

        System.out.println(trIn.al_res(trains));
    }


    @Override
    public ArrayList<Train> al_res(Train[] trains) {
        ArrayList al_res = new ArrayList<>();
        int time_pyti = 0;
        int avgSkorost = 0;
        for (int i = 0; i < trains.length; i++) {
            time_pyti = trains[i].getT_otbitiya() - trains[i].getT_pribitiya();
            avgSkorost = trains[i].getRasstoyanie()/time_pyti;
            al_res.add(avgSkorost);
        }
        return al_res;
    }
}
