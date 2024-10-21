package ALina.OOP;

public class Main {
    public static void main(String[] args) {
        Students students = new Students("Pi", "2F",3,5, 4);
        Students students1 = new Students("Pi1", "2F1",5,2, 4);
        Students students2= new Students("Pi2", "2F2",1,5, 3);
        Students students3 = new Students("Pi3", "2F3",3,4, 4);
        Students students4 = new Students("Pi4", "2F4",1,5, 5);

        Students[] numStud = {students,students1,students2,students3,students4};
        myMethod(numStud);
    }

    static void myMethod (Students[] students){

        double avarage = 0;
        for (int i = 0; i < students.length; i++) {
          avarage = (students[i].getPhisics() +students[i].getInfo()+students[i].getHistory())/ students.length;

        }
        System.out.println(avarage);

    }
}
