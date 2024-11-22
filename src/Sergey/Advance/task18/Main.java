package Sergey.Advance.task18;

import java.util.ArrayList;
import java.util.List;

public class Main implements CorpInter{
    public static void main(String[] args) {
        Corp[] corps = {
                new Corp("Apple1", 20.35,20,10,50,"Aplle"),
                new Corp("Apple2", 21.35,21,11,51,"Aplle"),
                new Corp("Apple3", 22.35,22,12,52,"Aplle"),
                new Corp("Apple4", 23.35,23,13,53,"Aplle"),
                new Corp("Apple5", 24.35,24,14,54,"Aplle")
        };

        CorpInter ci = new Main();

        System.out.println(ci.alCorp(corps));
        System.out.println(ci.kolvo(corps));
    }

    @Override
    public List<Corp> alCorp(Corp[] res) {
        List<Corp> alRes = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            int kol = (res[i].getYear() - 31) * -1;
            if(kol < 20){
                alRes.add(res[i]);
            }
        }
        return alRes;
    }

    @Override
    public int kolvo(Corp[] res){
      int kolvo = 0;
        for (int i = 0; i < res.length; i++) {
            int kol = (res[i].getYear() - 31) * -1;
            if(kol < 20){
                ++kolvo;
            }
        }
        return kolvo;
    }
}
