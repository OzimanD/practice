package ALina.OOP.page121_5;

import java.util.ArrayList;

public class Main implements Interface {
    public static void main(String[] args) {
        Worker w1 = new Worker("Иванов", "Иван", "Иванович", "Менеджер", 50000, 5);
        Worker w2 = new Worker("Петров", "Петр", "Петрович", "Инженер", 60000, 6);
        Worker w3 = new Worker("Сидоров", "Сидор", "Сидорович", "Директор", 120000, 4);
        Worker w4 = new Worker("Козлов", "Алексей", "Алексеевич", "Секретарь", 40000, 5);

        Worker[] w ={w1,w2,w3,w4};

        Interface in = new Main();
        System.out.println(in.bornInMay(w));


    }

    @Override
    public ArrayList<Worker> bornInMay(Worker[] workers) {
        ArrayList<Worker> result = new ArrayList<>();
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getBirthDate() == 5) {
                result.add(workers[i]);

            }

        }
        return  result;
    }
}
