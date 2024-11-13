package ALina.OOP.page121_8;

public class Workers {
    private String surname;
    private String name;
    private String fatherName;
    private String position;
    private int salary;
    private int yearOfBirth;

public Workers(){};

    public Workers(String surname, String name, String fatherName, String position, int salary, int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.position = position;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
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

    @Override
    public String toString() {
        return "Workers{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
