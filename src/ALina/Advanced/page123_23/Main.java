package ALina.Advanced.page123_23;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main implements NewSigned{
    public static void main(String[] args) {

        Workers[] a = {
                new Workers("A", "a", LocalDate.of(2000,03,22),LocalDate.of(2024, 04,05), "1000"),
                new Workers("B", "b", LocalDate.of(2001,03,22),LocalDate.of(2024, 04,05), "2000"),
                new Workers("C", "c", LocalDate.of(2024,03,22),LocalDate.of(2024, 04,05), "3000"),
                new Workers("D", "d", LocalDate.of(2023,03,22),LocalDate.of(2024, 04,05), "4000"),
                new Workers("E", "e", LocalDate.of(2022,03,22),LocalDate.of(2024, 04,05), "5000"),
        };

        Main main = new Main();
        System.out.println(main.workers(a));

    }

    @Override
    public ArrayList<Workers> workers(Workers[] workers) {
        ArrayList<Workers> n = new ArrayList<>();
        for (int i = 0; i < workers.length ; i++) {

            if (LocalDate.now().getYear() - workers[i].getSignedDate().getYear()<=1 ){
                n.add(workers[i]);

            }

        }
       return n;
    }
}
