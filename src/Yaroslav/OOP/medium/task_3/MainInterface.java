package Yaroslav.OOP.medium.task_3;

import java.util.ArrayList;

public interface MainInterface {

    public ArrayList<Worker> findWantedWorkers(Worker[] workers, int wantedSalary, int wantedYear);

    public <T> void printWorkerList(T workers);
}
