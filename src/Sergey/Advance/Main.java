package Sergey.Advance;

import java.util.ArrayList;
import java.util.List;

public class Main implements AirInter{
    public static void main(String[] args) {
        Air[] airs = {
                new Air(123,14,23,"Boing1","Kiev1",2000),
                new Air(132,15,22,"Boing2","Kiev2",5000),
                new Air(143,4,15,"Boing3","Kiev3",3020),
                new Air(155,6,12,"Boing4","Kiev4",1234),
                new Air(134,5,3,"Boing5","Kiev5",5312)
        };

        AirInter ai = new Main();

        System.out.println(ai.lAir(airs));
    }

    @Override
    public List<Air> lAir(Air[] airs) {
        List<Air> la = new ArrayList<>();
        int temp = airs[0].getAvgSpeed();
        for (int i = 0; i < airs.length; i++) {
//            speed = (airs[i].getT_trileta() - airs[i].getT_vileta()) / airs[i].getRastoyanie();
            if (temp <= airs[i].getAvgSpeed()){
                la.add(airs[i]);
            }
        }
        return la;
    }
}
