package Yaroslav.OOP.medium.task_3;

public class Worker extends Person{

    private String position;
    private int salary;
    private int yearOfBirth;

    public Worker(String lastName, String firstName, String patronymic, String position, int salary, int yearOfBirth) {
        super(lastName, firstName, patronymic);
        this.position = position;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "patronymic='" + patronymic + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
