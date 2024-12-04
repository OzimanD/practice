package ALina.Advanced.page122_17;

import java.util.ArrayList;

public class Main implements Interface {
    public static void main(String[] args) {

        Avia[] avias = {
                new Avia("Plane A", 2018, 2023, 150000.00, "X123"),
                new Avia("Plane B", 2015, 2024, 175000.00, "Y456"),
                new Avia("Plane C", 2019, 2023, 200000.00, "Z789")
        };

        Main main = new Main();
        ArrayList<Avia> expiredAvias = main.expiryYear(avias);
        for (Avia avia : expiredAvias) {
            System.out.println(avia);
        }
    }

    @Override
    public ArrayList<Avia> expiryYear(Avia[] avias) {
        ArrayList<Avia> avias1 = new ArrayList<>();
        for (int i = 0; i < avias.length; i++) {
            if (avias[i].getExpiryYear() == 2024 &&
                    (avias[i].getExpiryYear() - avias[i].getProductionYear()) == 1) {
                avias1.add(avias[i]);
            }
        }
        return avias1;
    }
}
