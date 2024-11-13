package Yaroslav.OOP.medium.task_7;

public class Main implements MainMenu{

    public double getAverageExperience(Worker[] workers){

        double expSum = 0;

        for(Worker worker : workers){
            expSum += worker.getExperience();
        }

        return  expSum;
    }

    public void printWorkerList(Worker[] workers, double averageExp){

        for(Worker worker : workers){
            if (worker.getExperience() > averageExp){
                System.out.println(worker);
            }
        }

    }

    public static void main(String[] args) {




    }


}
