package Mamontoboi.Task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("JohnDoe", "SV-31", 4, 5, 4);
        Student student2 = new Student("JaneDoe", "SV-31", 5, 5, 5);
        Student student3 = new Student("BrotherDoe", "SV-33", 4, 3, 3);
        Student student4 = new Student("SisterDoe", "SV-36", 3, 4, 5);

        Student[] students = {student1, student2, student3, student4};

        System.out.println("Average grade is " + getAverage(students));
        int count = numberOfStudents(students);
        System.out.println("The number of students with 5 is " + count);

        List<Student> surnames = new ArrayList<>(surnamesOfNerds(students));

        for(Student tmp : surnames){
            System.out.println(tmp);
        }
    }

    public static double getAverage(Student[] students){
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getPhysics();
        }
        return (double) sum / students.length;
    }

    public static List surnamesOfNerds(Student[] students){
        List<Student> nerdsNames = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getInformatics() == 5){
                nerdsNames.add(students[i]);
            }
        }
        return nerdsNames;
    }

    public static int numberOfStudents(Student[] students){
        int number = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getInformatics() == 5){
                number++;
            }
        }
        return number;
    }
}
