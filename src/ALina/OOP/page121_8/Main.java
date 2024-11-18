package ALina.OOP.page121_8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main implements Interface {
    public static void main(String[] args) {
        Workers[] w = {new Workers("sur","A","A","A",2333, 1989),
                new Workers("sur","A","A","A",2333, 1959),
                new Workers("sur","A","A","A",2333, 1979),
                new Workers("sur","A","A","A",2333, 1999)};


        Interface main = new Main();
        System.out.println(main.theYoungestWorker(w));

    }

    @Override
    public Workers theYoungestWorker(Workers[] workers) {
        Workers worker  = new Workers();

        int min;
        min = workers[0].getYearOfBirth();

        for (int i = 0; i < workers.length; i++) {

            if (min<workers[i].getYearOfBirth()){
                min = workers[i].getYearOfBirth();
                worker = workers[i];
            }
        }


        return worker;
    }
}
