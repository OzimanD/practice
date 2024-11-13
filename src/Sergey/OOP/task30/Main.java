package Sergey.OOP.task30;

import java.util.ArrayList;

public class Main implements PCInter{
    public static void main(String[] args) {
        PC[] psc = {
                new PC("Avole1",3,8,true,800),
                new PC("Avole2",5,6,false,700),
                new PC("Avole3",1,2,false,300),
                new PC("Avole4",2,8,true,500),
                new PC("Avole5",5,4,false,450)
        };

        PCInter pci = new Main();

        System.out.println(pci.al_res(psc));
    }

    @Override
    public ArrayList<PC> al_res(PC[] pcs) {
        ArrayList<PC> al_pc = new ArrayList<>();
        for (int i = 0; i < pcs.length; i++) {
            if(pcs[i].isRom() == true){
                al_pc.add(pcs[i]);
            }
        }
        return al_pc;
    }
}
