package Yaroslav.OOP.medium.task_3;

import java.util.ArrayList;

public class Main implements MainInterface {

    public ArrayList<Worker> findWantedWorkers(Worker[] workers, int wantedSalary, int wantedYear){

        ArrayList<Worker> result = new ArrayList<>();

        for(Worker worker : workers){
            if ((worker.getSalary() > wantedSalary) && (worker.getYearOfBirth() > wantedYear))
                result.add(worker);
        }

        return result;
    }

    public <T> void printWorkerList(T workers){

        try {
            if (workers.getClass().equals(Worker[].class)) {

                Worker[] workerArray = (Worker[]) workers;

                for (Worker worker : workerArray) {
                    System.out.println(worker);
                }

            } else if (workers.getClass().equals(ArrayList.class)) {

                ArrayList<?> workerList = (ArrayList<?>) workers;

                for (Object worker : workerList) {
                    if (worker instanceof Worker) {
                        System.out.println(worker);
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {

        Main menu = new Main();

        Worker[] workers = {
                new Worker("Шевченко", "Олександр", "Іванович", "Менеджер", 18000, 1985),
                new Worker("Коваленко", "Марія", "Петрівна", "Програміст", 30000, 1990),
                new Worker("Бондар", "Андрій", "Сергійович", "Аналітик", 18000, 1988),
                new Worker("Захаренко", "Ольга", "Володимирівна", "Дизайнер", 17000, 1992),
                new Worker("Іванов", "Микола", "Олександрович", "Тестувальник", 16000, 1987),
                new Worker("Петренко", "Ірина", "Миколаївна", "HR", 14000, 1986),
                new Worker("Сидоренко", "Юрій", "Васильович", "Архітектор", 22000, 1997),
                new Worker("Мельник", "Світлана", "Борисівна", "Інженер", 15500, 1991),
                new Worker("Кравченко", "Віктор", "Іванович", "Бухгалтер", 14500, 1989),
                new Worker("Романенко", "Галина", "Сергіївна", "Дизайнер", 21000, 1995)
        };

        ArrayList<Worker> wantedWorkers = menu.findWantedWorkers(workers, 19000, 1994);

        System.out.println("Список працівників:\n");

        menu.printWorkerList(wantedWorkers);
    }
}
